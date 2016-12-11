import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zsofiaprincz on 04/12/16.
 */
public class Bank extends ArrayList<Account>{

    static Scanner userInput = new Scanner(System.in);

    final int divident = 100;

    ArrayList<Account> accounts = new ArrayList<>();



    public void PayingDivident(){
        for(int i=0; i<accounts.size();i++) {
            accounts(i)+=
        }
    }

    public void CloseAccount(int accountNumber){

        try {
            remove(accountNumber);

            for(Account a : accounts) {

                }
            } catch(Exception e){

            }
        }

    public void OpenAccount(){

    }

}
