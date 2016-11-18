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
//                try {
//
//                    Scanner removeCommand = new Scanner(System.in);
//                    int removeIndex = removeCommand.nextInt();
//                    firstList.Remove(removeIndex - 1);
//                }
//                catch (IndexOutOfBoundsException e){
//                    System.out.println(e.getMessage() + " Unable to complete: Index is out of bound");
//                }


            }

            //help

            else if (lastinput.startsWith("h")){
                new Texts();
            }

            //list



            else if (lastinput.equals("list")) {

                firstList.displayTodoList();
            }




        }









    }
}
