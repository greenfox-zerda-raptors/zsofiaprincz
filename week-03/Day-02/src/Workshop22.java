/**
 * Created by zsofiaprincz on 03/11/16.
 */
public class Workshop22 {
    public static void main(String... args) {
        String first = "I am the first string!";
        String second = "I think I'm longer than first..";

        int firstLength = first.length();
        int secondLength = second.length();
        String answer = " ";
        if (firstLength > secondLength) {
            answer = "first is bigger than second";
        } else if (firstLength < secondLength) {
            answer = "second is longer than first";
        } else {
            answer = "they are equal";
        }

        System.out.println(answer);
    }
}

// Decide if "first" string is longer than "second" string and store it in a variable
// Print the value of the variable