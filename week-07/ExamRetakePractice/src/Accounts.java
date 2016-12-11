/**
 * Created by zsofiaprincz on 12/12/16.
 */
public abstract class Accounts {

    private String firstname;
    private String lastname;
    private String address;
    private int accountNumber;
    private int balance;

    public Accounts(String firstname, String lastname, String address, int accountNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public Accounts(String firstname, String lastname, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }



    public abstract void audit();

    public void deposit(int despositMoney){
        balance+=despositMoney;


    }

    public int getBalance() {
        return balance;
    }

    public void moneyTransfer(Accounts accountFrom, Accounts accountTo, int transferAmount){
        int originalBalanceOnAccountToDeduct = accountFrom.getBalance();
        originalBalanceOnAccountToDeduct-=transferAmount;
        int originalBalanceOnAccountToIncrement = accountTo.getBalance();
        originalBalanceOnAccountToIncrement+=transferAmount;

    }
}
