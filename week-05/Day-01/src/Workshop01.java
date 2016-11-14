/**
 * Created by zsofiaprincz on 14/11/16.
 */
public class Workshop01 {

    public static void main(String[] args) {

        Car myCar = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();


        myCar.setColor("red");
        myCar.setSizeEngine(1600);
        myCar.setKm(12312);
        myCar.setType("Mazda");

        myCar2.setColor("silver");
        myCar2.setSizeEngine(2500);
        myCar2.setKm(152312);
        myCar2.setType("Ford");

        myCar3.setColor("green");
        myCar3.setSizeEngine(2800);
        myCar3.setKm(42521);
        myCar3.setType("Beamon");

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
