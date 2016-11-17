import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zsofiaprincz on 17/11/16.
 */
public class Commands {

//    String defaultcommands =




    public ArrayList<Todoitem> todo = new ArrayList<Todoitem>();

    public void Add (String v){
        ArrayList<Todoitem> todo = new ArrayList<Todoitem>();
        Todoitem nexttodo = new Todoitem(v);
        todo.add(nexttodo);

    }

    public void List (String v){
        System.out.println(todo.toString());
    }

    public void Remove (int index) {
        todo.remove(index);
    }

    public void

}
