/**
 * Created by zsofiaprincz on 15/11/16.
 */
public class Animals {

    int lifeExpectency;
    boolean isCarnivore;


    public Animals () {
        System.out.println("created animal");
//        lifeExpectency = 10;
//        isCarnivore = false;
        this.lifeExpectency = 10;
        this.isCarnivore = false;
    }

//    public boolean isCarnivore() {
//        System.out.println("created an animal");
//        return isCarnivore;
//    }
//
//    public int getLifeExpectency() {
//        System.out.println("created an animal");
//        return lifeExpectency;
//    }

    public Animals (int lifeExpectency, boolean isCarnivore) {
        this.lifeExpectency = lifeExpectency;
        this.isCarnivore = isCarnivore;

    }

    public Animals (String type){
            System.out.println("Animal is created");
           System.out.println(type + " Animal is created");
          }


    public void sleep() {
        System.out.println("animal sleeps");

    }
    public void eat() {
        System.out.println("Animal is eating");

    }

    public void speak() {
        System.out.println("animal speaks");
    }

    public String toString (){
        return String.format("isCarnivore=%b,lifeExpectancy=%d",
                isCarnivore,
                lifeExpectency);

    }



}
