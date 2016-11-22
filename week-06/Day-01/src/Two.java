import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zsofiaprincz on 21/11/16.
 */
public class Two {

    public static int sum(ArrayList<Integer> integerArrayList) {
        int sum = 0;
        for (Integer i : integerArrayList) {
            sum += i;
        }
        return sum;
    }
}