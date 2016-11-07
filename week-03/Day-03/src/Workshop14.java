import java.util.Collections;
import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 06/11/16.
 */
public class Workshop14 {

    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };

      /*  int temp = ah[i];
        ah[i] = ah[end-i];
        ah[end-i] = temp;
        int l = ah.length;
        for(int i=0;i<l;i++){
            int temp = ah[i];
            ah[i] = ah[l -i -1];
            ah[l-i-1] = temp;
            System.out.print(ah[i] + " ");
        };*/

        ArrayList<Integer> ahNew = new ArrayList<Integer>();
        for (int x: ah) {
            ahNew.add(x);
        }
        Collections.sort(ahNew, Collections.reverseOrder());
        System.out.println(ahNew);

        System.out.println();
    }
}
