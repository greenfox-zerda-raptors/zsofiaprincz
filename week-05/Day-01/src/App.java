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
        Car myCar05 = new Car("Opel", "white", 1400, 25);
        Car myCar06 = new Car("VW", "grey", 1600, 10); // defaults to 1600 cc, 10 kms
        Car myCar07 = new Car(myCar.getColor(),myCar.getType(), myCar.getSizeEngine(), myCar.getKm() ); // defaults to a red Mazda

//previous exercise
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




        System.out.println(myCar.toString());
        System.out.println(myCar2.toString());
        System.out.println(myCar3.toString());
        System.out.println(myCar05.toString());
        System.out.println(myCar06.toString());
        System.out.println(myCar07.toString());
        myCar.drive(15);

        Garage garage = new Garage();
        garage.addCar(myCar);
        garage.addRandomCar();
        System.out.println(garage.toString());


        //previous exercise

//        System.out.printf("This " + myCar.getType() +  " is " + myCar.getColor() + " has " + myCar.getSizeEngine() + " cc Engine and clocked " + myCar.getKm() + " km's.\n");

    }
}

