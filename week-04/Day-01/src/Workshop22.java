import java.util.HashSet;

/**
 * Created by zsofiaprincz on 30/11/16.
 */
public class Workshop22 {

    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first second third third");
        // Accidentally I inserted the word "third" twice. Your task is to change the last word to "fourth"
        // Expected outpt: first second third fourth

        sb.delete(13,18);
        System.out.println(sb.toString());
    }
}
