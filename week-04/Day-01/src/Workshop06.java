import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zsofiaprincz on 20/11/16.
 */
public class Workshop06 {

    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        // Accidentally we added number 3 twice. Your task is to remove it from the list

        Set<Integer> arrayList2 = new HashSet<>();
        arrayList2.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);

        System.out.println(arrayList2);
    }
}
