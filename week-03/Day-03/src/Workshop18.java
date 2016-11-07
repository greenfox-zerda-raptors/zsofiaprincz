/**
 * Created by zsofiaprincz on 07/11/16.
 */
public class Workshop18 {

    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

        System.out.println(sum(5));
    }

    public static int sum(int n){
        int out =0;

        for(int i = 1; i <= n; i++)
             out= out + i;
        return out;


    }


}
