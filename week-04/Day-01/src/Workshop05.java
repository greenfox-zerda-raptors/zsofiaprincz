import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zsofiaprincz on 20/11/16.
 */
public class Workshop05 {

    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));

        int[] numArray = new int[numList.size()];
        int i = 0;
        for (int n : numList) {
            numArray[i] = n;
            i++;

        }

        System.out.println(Arrays.toString(numArray));
        }

        }
        // Copy every element of "numList" to an Array




