/**
 * Created by zsofiaprincz on 30/11/16.
 */
public class Workshop21 {

    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first third fourth");
        // Add "second" to the StringBuilder (sb) between the words "first" and "third"
        // Expected outpt: first second third fourth
        sb.insert(6,"second ");

        System.out.println(sb.toString());
    }
}
