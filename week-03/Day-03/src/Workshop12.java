import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * Created by zsofiaprincz on 06/11/16.
 */


    public class Workshop12{
        public static void main(String[] args) {
            // Swap the first element of the array
            // Expected outpt: third second first
            String[] abc = new String[] { "first", "second", "third" };



            for(int i=0;i<abc.length;i++){

               /* String swap = " ";

                swap = abc[0];
                abc[0] = abc[2];
                abc[2] = swap; Stolen from Bea */


                    String temp = abc[0];
                    abc[0] = abc[2];
                    abc[2] = temp;



                System.out.print(abc[i] + " ");
            }
        }
    }

