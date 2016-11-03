/**
 * Created by zsofiaprincz on 03/11/16.
 */
public class Workshop35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567
        String str = "";
        for (int i = 1; i < 8; i++) {
            str = str + i;
            String formatted = str.format("%-7s", str).replace(' ', '*');

            System.out.println(formatted);
        }

    }
}
