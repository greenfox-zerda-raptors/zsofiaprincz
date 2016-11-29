import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by zsofiaprincz on 29/11/16.
 */
public class Workshop15 {

    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7" ));
        // Add "a" to every string in al. Use a for(each) loop

        Iterator<String> it = al.iterator();

        for (String b:al) {
            System.out.println(it.next()+ "a");
        }
    }
}
