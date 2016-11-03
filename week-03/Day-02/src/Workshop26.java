/**
 * Created by zsofiaprincz on 03/11/16.
 */
public class Workshop26 {
    public static void main(String[] args) {
        String x = "cheese";
        // Tell if the x has even or odd number of
        // characters with a True for even and
        // false False output otherwise
        int numberOfCharacters = x.length();
        String answer = "";
        if (numberOfCharacters % 2 == 0) {
            answer = "True";
        }else {
            answer = "False";
        }
        System.out.println(answer);
    }
}
