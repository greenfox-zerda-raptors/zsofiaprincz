import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 17/11/16.
 */
public class Todolist {

    public ArrayList<Todoitem> todo = new ArrayList<>();

//list

    public void load(){
        try (BufferedReader storedTodoList = new BufferedReader(new FileReader("/Users/zsofiaprincz/Greenfox/zsofiaprincz/week-05/Project/todolist.txt/"))) {
            String Currentline;
            if ((Currentline = storedTodoList.readLine()) != null) {
                Todoitem nexttodo = new Todoitem(Currentline) ;
                todo.add(nexttodo);

            } else {
                System.out.println("No todos for today! :)");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayTodoList() {
        for (int i = 0; i < todo.size(); i++) {
            System.out.println(i + 1 + " - " + todo.get(i));
        }


    }

    //add

    public void Add (String v) {

        Todoitem nexttodo = new Todoitem(v);
        todo.add(nexttodo);

    }



    //remove

    public void Remove(int index) {
        todo.remove(index-1);
    }









}

