import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by zsofiaprincz on 29/11/16.
 */
public class Workshop14 {

    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!
        Iterator<String> it = al.iterator();
//        for (String b: al) {
//        }

        while (it.hasNext()){
            System.out.println(it.next()+ "a");


        }


    }
}
