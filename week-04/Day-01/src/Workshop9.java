import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zsofiaprincz on 20/11/16.
 */
public class Workshop9 {

    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("second", "third", "fourth"));
        // Add "first" to the beginning of the list and add "fifth" to the end of the list
        // Expected output: [first, second, third, fourth, fifth]
        list.add(0, "first");
        list.add(list.size(),"fifth");

        System.out.println(list);
    }

}
