import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zsofiaprincz on 20/11/16.
 */
public class Workshop07 {

    public static void main(String... args){
        ArrayList<String> arrayList = new ArrayList<String>();
        int random = new Random().nextInt(20);
        for(int i=0;i<20;i++){
            if(i == random){
                arrayList.add("removable");
            }
            arrayList.add("" + i);
            arrayList.remove("removable");
        }
        // Remove "removable" from the list, but without using the index of the element.

        System.out.println(arrayList);
    }
}
