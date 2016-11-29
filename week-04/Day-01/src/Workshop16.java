import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by zsofiaprincz on 29/11/16.
 */
public class Workshop16 {

    public static void main(String... args){
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7 ));
        // Fix this code fragment! It should remove every even number from the list.


        for(Iterator<Integer> it = al.iterator();it.hasNext();) {
//            if(element % 2 == 0){
               if (it.next()%2 ==0){
                it.remove();
            }
        }
        System.out.println(al);
    }


}
