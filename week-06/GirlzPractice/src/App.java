/**
 * Created by zsofiaprincz on 04/12/16.
 */
public class App {

    public static void main(String[] args) {


        Bank bank = new Bank();

        SavingsAccount savingsAccount1 = new SavingsAccount(12345);
        SavingsAccount savingsAccount2 = new SavingsAccount(123456);
        SavingsAccount savingsAccount3 = new SavingsAccount(1234567);
        CurrentAccount currentAccount1 = new CurrentAccount(12345);
        CurrentAccount currentAccount2 = new CurrentAccount(123456);
        CurrentAccount currentAccount3 = new CurrentAccount(1234567);

        bank.add(savingsAccount1);
        bank.add(savingsAccount2);
        bank.add(savingsAccount3);
        bank.add(currentAccount1);
        bank.add(currentAccount2);
        bank.add(currentAccount3);

    }

}


