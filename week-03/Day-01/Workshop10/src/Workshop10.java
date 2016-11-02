/**
 * Created by zsofiaprincz on 02/11/16.
 */
public class Workshop10 {
    public static void main(String[] args) {
        int j1 = 10;
        int j2 = 3;
        // tell if j1 is between j2 squared and j2 cubed

        if (Math.pow(j2,2) <= j1 && j1<=Math.pow(j2,3) ) {
            System.out.println("j1 is between j2 squared and j2 cubed");
        } else {
            System.out.println("j1 is not between j2 squared and j2 cubed");
        }

        
    }
}
