import java.util.stream.IntStream;

/**
 * Created by zsofiaprincz on 06/11/16.
 */
public class Workshop13 {

    public static void main(String[] args) {
        int[] ah = new int[]{3, 4, 5, 6, 7};
        // print the sum of all numbers in ah


        int sum = IntStream.of(ah).sum();
        System.out.println("The sum is " + sum);

        System.out.println();

    }

}
