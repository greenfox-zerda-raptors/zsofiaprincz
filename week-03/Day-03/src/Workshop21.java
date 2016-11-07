/**
 * Created by zsofiaprincz on 07/11/16.
 */
public class Workshop21 {

    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

        System.out.println(factorial(6));
    }


        public static long factorial(int n) {
            System.out.println(n);
            if (n == 1) return 1;
            return n * factorial(n-1);
        }
    }

