/**
 * Created by zsofiaprincz on 17/11/16.
 */
public class Todoitem {

    boolean completion;
    String name;

    public Todoitem(String name) {
        this.name = name;
    }

    public String toString() {
        if (!completion) {
            return String.format("[ ] - %s", name);
        } else
            return String.format("[X] - %s", name);
    }


}

