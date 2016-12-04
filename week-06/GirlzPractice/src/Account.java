/**
 * Created by zsofiaprincz on 04/12/16.
 */
public class Account {

    private double balance;
    private int accountNumber;

    public Account(int accountNumber) {
        balance = 0.0;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amountAdded) {
        try {
            if (amountAdded > 0)
                balance += amountAdded;


        } catch (Exception AccountNegaive) {
            System.out.println("Cannot deposit negative amount");
        }

    }

    public void withdraw(double amountWithdrawn) {
        try {
            if (amountWithdrawn > 0)
                balance -= amountWithdrawn;
        } catch (Exception overdraw) {
            System.out.println("Cannot withdraw negative amount");
        }
    }

        public double getBalance(){
        return balance;
    }

        public double getAccountNumber() {
           return accountNumber;
    }

    public String toString()
    {
        return "Acc " + accountNumber + ": " + "balance = " + balance;
    }

    public final void print(){
        System.out.println( toString() );
    }
}






