import java.util.Scanner;

/**
 * Created by zsofiaprincz on 17/11/16.
 */
public class UserInputs {

    static Scanner userInput = new Scanner(System.in);


    public static String command() {
        String input = userInput.nextLine();
        return input;
    }
}
