import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Iterator;

/**
 * Created by zsofiaprincz on 08/11/16.
 */
public class Workshop18 {


    public static void main(String... args){
        String example = "A long example string";

        System.out.println(example.indexOf("long"));

        StringBuilder myStringBuilder = new StringBuilder(example);

        myStringBuilder.replace(2,6, "short");
        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected ouput: A short example string


        System.out.println(myStringBuilder);
    }
}
