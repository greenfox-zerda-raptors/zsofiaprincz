import java.util.Scanner;

/**
 * Created by zsofiaprincz on 17/11/16.
 */
public class UserInputs {

    static Scanner userInput = new Scanner(System.in);


    public static String command() {
        System.out.println("\nWhat would you like to do? Type command: or 0 to exit ");
        String input = userInput.nextLine();
        return input;
    }
}
