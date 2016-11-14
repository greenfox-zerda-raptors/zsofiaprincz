/**
 * Created by zsofiaprincz on 14/11/16.
 */
public class App {

    // App.java

    public static void main(String[] args){
        Car myCar = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();


        myCar.color = "red";
        myCar.sizeEngine = 1600;
        myCar.km = 12312;
        myCar.type = "Mazda";

        myCar2.color = "silver";
        myCar2.sizeEngine = 2500;
        myCar2.km = 152312;
        myCar2.type = "Ford";

        myCar3.color = "green";
        myCar3.sizeEngine = 2800;
        myCar3.km = 42521;
        myCar3.type = "Beamon";


        System.out.printf("This " + myCar.getType() +  " is " + myCar.getColor() + " has " + myCar.getSizeEngine() + " cc Engine and clocked " + myCar.getKm() + " km's.\n",
                "puke" , 1
        );

        System.out.printf("This " + myCar2.getType() +  " is " + myCar2.getColor() + " has " + myCar2.getSizeEngine() + " cc Engine and clocked " + myCar2.getKm() + " km's.\n",
                "puke" , 1
        );
        System.out.printf("This " + myCar3.getType() +  " is " + myCar3.getColor() + " has " + myCar3.getSizeEngine() + " cc Engine and clocked " + myCar3.getKm() + " km's.\n",
                "puke" , 1
        );
    }
}

