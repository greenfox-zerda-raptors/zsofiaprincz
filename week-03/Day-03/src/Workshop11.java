import java.util.Arrays;

/**
 * Created by zsofiaprincz on 06/11/16.
 */



    public class Workshop11{
        public static void main(String[] args) {
            String[] ah = new String[] {"kuty", "macsk", "cic"};
            // add to all elements an 'a' on the end

            for (int i =0; i<ah.length; i++) {
                ah[i] = ah[i] + "a";
            }

            System.out.print(Arrays.toString(ah));
        }
    }



