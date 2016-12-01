import static java.awt.Color.red;

/**
 * Created by zsofiaprincz on 14/11/16.
 */
public class App {

    // App.java

    public static void main(String[] args){
        Car myCar = new Car("Mazda", "red", 1600, 12312);
        Car myCar2 = new Car("Ford", "silver", 2500, 15312);
        Car myCar3 = new Car("Beamon", "green", 2800, 42521);


//        myCar.color = "red";
//        myCar.sizeEngine = 1600;
//        myCar.km = 12312;
//        myCar.type = "Mazda";
//
//        myCar2.color = "silver";
//        myCar2.sizeEngine = 2500;
//        myCar2.km = 152312;
//        myCar2.type = "Ford";
//
//        myCar3.color = "green";
//        myCar3.sizeEngine = 2800;
//        myCar3.km = 42521;
//        myCar3.type = "Beamon";




        System.out.printf(myCar.toString());
        System.out.printf(myCar2.toString());
        System.out.printf(myCar3.toString());
    }
}

