import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zsofiaprincz on 29/11/16.
 */
public class Workshop17 {

    // Implement trimAll(..)
    // Expected output:
    // "first"
    // "second"
    // "third"
    // "fourth"
    // "fifth"

    static ArrayList<String> trimAll(List<String> strings) {

        ArrayList<String> al = new ArrayList<>();
        for(Iterator<String> itr = strings.iterator(); itr.hasNext();) {
            al.add(itr.next().trim());
        }
        return al;
        // ???
    }

    public static void main(String... args){
        List<String> strList = new ArrayList<String>(Arrays.asList("   first", "second   ", "  third ", "fourth", "    fifth "));
        trimAll(strList);
        for (String str : strList) {
            System.out.format("\"%s\"%n", str);
        }
    }
}
