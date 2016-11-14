/**
 * Created by zsofiaprincz on 13/11/16.
 */


import java.util.EmptyStackException;
import java.util.Scanner;

/**************************************************************************************************
     * Workshop: Practice Exceptions: Throw multiple exceptions
     *
     * Go back to the Workshop07 (7 ate 9) and extend it to also throw an exception for 9 (it's no longer
     * useful as a number, it's just a "pile of bones")
     *
     * see the example at http://beginnersbook.com/2013/12/throws-keyword-example-in-java/
     * to see how one can create multiple throws
     *
     * INPUT? 7
     * Exception: 7's are cannibals
     * INPUT? 9
     * Exception: Nothing but bones
     **************************************************************************************************/

    public class Workshop11{

    static void myMethod(int inNumber) // something should appear here before
    {
        if (inNumber == 7) // do that thing that chucks the reprobate out
            // something here
            throw new EmptyStackException();
        else if( inNumber ==9){
        throw new IndexOutOfBoundsException();
    }

        System.out.println("Nice number");
        return;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int age;
        String prompt = "Enter a value from 1 to 9 or 0 to exit?";

        System.out.println(prompt);
        while (userInput.hasNextInt()) {
            age = userInput.nextInt();
            if (age == 0) {
                break;
            } else {
                try {
                    System.out.println("try - first statement");
                    myMethod(age);
                    System.out.println("try - last statement");

                } catch (Exception ex) {
                    System.out.println("An Exception");
                }
            }
        } //while
    }
    }



