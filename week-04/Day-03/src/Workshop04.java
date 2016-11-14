/**
 * Created by zsofiaprincz on 13/11/16.
 */

/**************************************************************************************************
 * Workshop: Practice Exceptions: Cascading problems
 *
 * What if there are lots of different types of errors?
 *
 * We've got an array and a mad man writing idiotic code (me!).  Deal with my mayhem and get to
 * the ::::FINISH LINE::::
 *
 * Note that there should not be Compile Time errors.
 *
 **************************************************************************************************/
import java.util.*;

    public class Workshop04{
        public static void main(String[] args){

            int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
            String two = "2";

            try {
                System.out.println("Testing ...");
                a[2] = a[3] / a[0];
            } catch (ArithmeticException e){
            System.out.println("Caught IOException: " + e.getMessage());
            }

            try {
                System.out.println("Past hurdle 1");
                a[9] = Integer.parseInt(two);
                System.out.println("Past hurdle 2");
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Caught IOExceptio:" + e.getMessage());
            }

            try {
                System.out.println("Past hurdle 2");
                a[10] = Integer.parseInt("ten");
            }catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("Past hurdle 3...  And I realized perhaps I'm wrong");
                a[10] = 10;
            }catch (ArrayIndexOutOfBoundsException e){}
            try {
                System.out.println("Past hurdle 4");
                two = "two";
            }catch (NumberFormatException e) {}
            try {
                System.out.println("Past hurdle 5");
                a[9] = Integer.parseInt(two);
            }catch (NumberFormatException e) {}

            System.out.println("*** FINISH LINE ***");
        }
    }
