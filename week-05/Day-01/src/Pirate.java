/**
 * Created by zsofiaprincz on 29/11/16.
 */
public class Pirate {
    private int drinkNumber;
    private boolean isAlive;


    public Pirate() {
        drinkNumber = 0;
        isAlive = true;
    }

    public void drinkSomeRum () {
        System.out.printf("Drinknumber: %d\n",drinkNumber);
        drinkNumber ++;
    }

    public String howItsGoingMate() {
        if (drinkNumber<=4){
            return"Pour me anudder!";
        }

        return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    }

    public void die(){
        isAlive=false;
    }



    public boolean getIsAlive() {
        return isAlive;
    }
}
