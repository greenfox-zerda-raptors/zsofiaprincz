package Main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zsofiaprincz on 01/12/16.
 */
public class App extends JFrame{



    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Horse ("Paci"));
        animals.add(new Horse ("Saci"));
        animals.add(new Horse ("Paca"));
        animals.add(new Mouse ("Rudy"));
        animals.add(new Mouse ("Sicc"));
        animals.add(new Ant());

        for (Animal animal:animals) {
            System.out.println(animal);

        }

        Iterator<Animal> iterator = animals.iterator();

    }
}
