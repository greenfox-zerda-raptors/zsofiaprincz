/**
 * Created by zsofiaprincz on 07/11/16.
 */
public class Workshop19 {

    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(factorial(5));
    }

    public static int factorial (int n){
        int out =1;

        for(int i = 1; i <= n; i++)
            out= out * i;
        return out;
    }
}
