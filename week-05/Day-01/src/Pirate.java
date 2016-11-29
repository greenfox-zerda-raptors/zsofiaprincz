/**
 * Created by zsofiaprincz on 29/11/16.
 */
public class Pirate {
    private int drinkNumber;
    private boolean isAlive;
    private boolean isAsleep;

    public Pirate() {
        drinkNumber = 0;
        isAlive = true;
        isAsleep = false;
    }

    public String drinkSomeRum () {

        if (isAlive) {
            if (!isAsleep) {
                drinkNumber++;
            }

//            if (drinkNumber > 4) {
//                isAsleep = true;
//                return "He's asleep";
//            }

        } else {
            return "He's dead";
        }
        return String.format("Drink number: %d", drinkNumber);
    }

//        if(isAlive && !isAsleep){
//            drinkNumber++;
//            System.out.printf("Drinknumber: %d\n",drinkNumber);
//        }  if(!isAlive){
//            return "He is dead";
//        } if (drinkNumber>4){
//            isAsleep = true;
//            return "He's asleep";
//        }




//        if(isAlive){
//            drinkNumber ++;
//            System.out.printf("Drinknumber: %d\n",drinkNumber);
//        }
//        return "He is dead";


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
