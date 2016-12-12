/**
 * Created by zsofiaprincz on 12/12/16.
 */
public class MoneyMarketAccount extends Accounts {
    public MoneyMarketAccount(String firstname, String lastname, String address, int accountNumber) {
        super(firstname, lastname, address, accountNumber);
    }

    public MoneyMarketAccount(String firstname, String lastname, String address) {
        super(firstname, lastname, address);
    }

    @Override
    public void audit() {

    }
}
