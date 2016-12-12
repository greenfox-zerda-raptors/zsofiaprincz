import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 12/12/16.
 */
public class Bank {

    public static void main(String[] args) {


        ArrayList<Accounts> accounts = new ArrayList<>();

        SavingsAcount savingsAcount = new SavingsAcount("Kutya", "Bela", "Vasarosnameny", 12345);
        accounts.add(savingsAcount);

        MoneyMarketAccount moneyMarketAccount = new MoneyMarketAccount("Sullivan", "Richard", "Boston", 123456);
        accounts.add(moneyMarketAccount);

        moneyMarketAccount.deposit(100);
        moneyMarketAccount.moneyTransfer(moneyMarketAccount,savingsAcount,100);
    }

}


