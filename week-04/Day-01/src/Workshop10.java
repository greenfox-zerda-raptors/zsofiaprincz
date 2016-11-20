import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zsofiaprincz on 20/11/16.
 */
public class Workshop10 {

    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "sixth", "third", "fourth", "fifth"));
        // Accidentally I added "sixth" instead of "second"! Your task is to swap "sixth" with "second"

        list.remove("sixth");
        list.add(1, "second");

        System.out.println(list);
    }
}
