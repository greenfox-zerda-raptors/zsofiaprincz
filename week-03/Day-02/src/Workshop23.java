/**
 * Created by zsofiaprincz on 03/11/16.
 */
public class Workshop23 {
    public static void main(String[] args) {
        int v = 426;
        // print 'Yeah!' if dividable by 4 but print 'End of program' after regardless
        boolean examination = 426 % 4 == 0;
        String answer = "";
        if (examination=true) {
            answer = "Yeah!";
        } else {
            answer = "End of program";
        }

        {
            System.out.println(answer);
        }
    }
}
