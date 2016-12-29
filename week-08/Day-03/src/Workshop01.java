import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class Workshop01 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/accounts?user=root&password=smoketheweed"; //schema neve

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        Dao<Account, String> accountDao =
                DaoManager.createDao(connectionSource, Account.class); // ez osszekoti a classt az sql-el

        TableUtils.createTable(connectionSource, Account.class); //ez megcsinalja a tablazatot

        Account account = new Account();
        account.setName("Captain America");
        account.setPassword("uejnsd632**234.");

        accountDao.create(account); // amikor letrehoztuk a usert akkor kerul be a database-be

        Account account2 = accountDao.queryForId("Captain America");
        System.out.println("Account: " + account2.getName());
    }
}
