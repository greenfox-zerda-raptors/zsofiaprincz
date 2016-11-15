/**
 * Created by zsofiaprincz on 15/11/16.
 */


    public class Birds extends Animals {



    public Birds () {
//        lifeExpectency = 2;
//        isCarnivore = false;
        super(2,false);
        System.out.println("new bird");


    }

    public void fly(){
        System.out.println("The bird can fly");
    }

//    public Birds(){
//        super("Birds");
//    }

    public void speak() {
        System.out.println("chirp");
    }

}

