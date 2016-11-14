import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zsofiaprincz on 13/11/16.
 */
public class Workshop03 {

    public static void main(String[] args){

    int input = -1;
        while(input != 0) {
        System.out.print("INPUT or 0 to end?");
        Scanner userInput = null;
        try {
            input = userInput.nextInt();
            if(input != 0) {
                String inputStr = Integer.toString(input);
                System.out.println("Yum " + inputStr.substring(0, inputStr.length() / 2));
            }
        } catch (InputMismatchException e) {
            System.out.println("Add a number which is not too high\n" + e.getMessage());
            userInput.nextLine();
        }

    }
        System.out.println("Bye!");
}
}
