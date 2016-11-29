/**
 * Created by zsofiaprincz on 29/11/16.
 */
public class AppPirate {

    public static void main(String[] args) {
        Pirate pirate = new Pirate ();
        pirate.drinkSomeRum();
        System.out.println(pirate.howItsGoingMate());

        pirate.drinkSomeRum();
        pirate.drinkSomeRum();
        pirate.drinkSomeRum();
        pirate.drinkSomeRum();

        System.out.println(pirate.howItsGoingMate());

        pirate.die();
        pirate.drinkSomeRum();

        System.out.println();

        System.out.println();


    }
}
