import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;

public class Workshop03 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop03?user=root&password=smoketheweed";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);
        TableUtils.createTableIfNotExists(connectionSource, Address.class);

        Dao<Account, String> accountDao =
                DaoManager.createDao(connectionSource, Account.class);

        Dao<Address, String> addressDao =
                DaoManager.createDao(connectionSource, Address.class);

        Address address = new Address("Andrássy út 66", "Budapest", "Hungary",1066);
        createAddressIfNotExists(addressDao, address);

        Address address2 = new Address("Andrássy út 67", "Budapest", "Hungary",1066);
        createAddressIfNotExists(addressDao, address2);

        Account account = new Account("Captain America", "uejnsd632**234.", address);
        createAccountIfNotExists(accountDao, account);

        Account account2 = new Account("Hulk", "bla", address2);
        createAccountIfNotExists(accountDao, account2);

        Account account3 = new Account("Iron Man", "1234", new Address("Andrassy ut 77", "Budapest", "Hungary",1066));
        createAccountIfNotExists(accountDao, account3);

        Account account4 = new Account("Wolverine", "1234", address2);
        createAccountIfNotExists(accountDao, account4);

        List<Account> accounts = accountDao.queryForAll();

        for (Account acc : accounts) {
            System.out.println(acc.toString());
        }
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }

    private static void createAddressIfNotExists(Dao<Address, String> addressDao, Address address) throws SQLException {
        if(addressDao.queryForId(String.valueOf(address.getAddrID())) == null) {
            addressDao.create(address);
        }
    }
}
