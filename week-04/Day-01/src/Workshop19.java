/**
 * Created by zsofiaprincz on 30/11/16.
 */
public class Workshop19 {

    public static void main(String... args){
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        builder.replace(0,5, "Hello ");
        builder.append(name);
        // Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder

        System.out.println(builder);
    }
}
