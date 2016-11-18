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

    public void load() {
        try (BufferedReader storedTodoList = new BufferedReader(new FileReader("/Users/zsofiaprincz/Greenfox/zsofiaprincz/week-05/Project/todolist.txt/"))) {
            String Currentline;
            while ((Currentline = storedTodoList.readLine()) != null) {
                Todoitem nexttodo = new Todoitem(Currentline);
                todo.add(nexttodo);


//                System.out.println("No todos for today! :)");
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

    public void Add(String v) {

        Todoitem nexttodo = new Todoitem(v);
        todo.add(nexttodo);

    }

//    public void makeCompleted(int i) {
//             try{
//                    ToDoItem item = ls.get(i - 1);
//                   item.setComplete(true);
//                } catch (IndexOutOfBoundsException e) {
//                 System.out.println("Unable to complete: Index is out of bound");
//                  }


    //remove

    public void Remove(int index) {
        todo.remove(index - 1);
    }

    public void remove(String index) {
        try {
                todo.remove(Integer.parseInt(index)-1);

              } catch (IndexOutOfBoundsException e) {
                    System.out.println("Unable to remove: Index is out of bound");
                 } catch (NumberFormatException e) {
                    System.out.println("Unable to remove: Index is not a number");
                  }


    }
}

