import java.util.Scanner;

/**
 * Created by zsofiaprincz on 17/11/16.
 */
public class App {

    public static void main(String[] args) {

//    String lastinput = UserInputs.command();
//            Todoitem nexttodo = new Todoitem();



        new Texts();
        Todolist firstList = new Todolist();
        firstList.load();

        char cmd = '0';

        while(cmd !=0){

            //program running


            String lastinput = UserInputs.command();

//            firstList.load();

            //add

            if (lastinput.startsWith("a")) {
                    firstList.Add(lastinput.substring(4));

            }

            //complete



            //remove

            else if (lastinput.startsWith("r")){
//
                firstList.remove(lastinput.substring(7));
            }

            //help

            else if (lastinput.startsWith("h")){
                new Help();
            }

            //list



            else if (lastinput.equals("list")) {

                firstList.displayTodoList();
            }




        }









    }
}
