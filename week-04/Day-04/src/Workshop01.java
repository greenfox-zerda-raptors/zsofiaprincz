/**
 * Created by zsofiaprincz on 10/11/16.
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;


public class Workshop01 {

    static int myNumber;
    static int guess;
    static int counter = 0;


    static Scanner userInput = new Scanner(System.in);

    public static void Checker() throws IOException {
        while (guess != myNumber && counter < 6) {
            System.out.println("guess?");
            guess = userInput.nextInt();
            counter ++; //fontos - itt az tortenik h noveli a guess-es korok szamat

            if (guess == 0) {
                System.out.println("You have typed 0, that means you have closed the program");
              System.exit(0);
            } else if (guess < myNumber) {
                System.out.println("Nope, you are too low");
            } else if (guess >myNumber) {
                System.out.println("Nope, you are too high");
            } else {
                System.out.println("Cool, you have just guessed it");
            }
        }

        File sourceFile = new File("/Users/zsofiaprincz/Greenfox/zsofiaprincz/week-04/Day-04/src/Workshop01.java");
        File destinationFile = new File("workshop.txt");
        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath()); // itt hoztuk letre a fajlt - Sopi magic
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Do you know how I did this Y/N");
        String answer = userInput.nextLine();
        System.out.println("Neither do I :), but here you can find the code in a file: " + destinationFile.getCanonicalPath());
        System.out.println("Thank you Sopi you saved my life and my file");
    }

    public static void main (String [] args) throws IOException {

        //First part

        System.out.println("Enter a top number in the range \n A nice hint for you: Don't choose a number bigger then 20 \n  or 0? \n");
        Integer maxNumber = userInput.nextInt();
        double random = Math.random(); //Zsofi fontos: A random nem ugy mukodik hogy megporget egy kockat, hanem 0 es 1 kozott general egy random racionalis szamot amit utana meg kell szorozni egy max value-val es at kell konvertalni integerre. Plusz pont hogy ha arra figyelsz h hozzaadj 1-et hiszen a random lehet 0 is elvileg
        myNumber = (int) (random * maxNumber-1 + 1);

        //Second part

        System.out.println("Okay, I've got a number. You should be able to figure that out in 6 goes, let's begin.");

        Checker();







    }
}


