/**
 * Created by zsofiaprincz on 15/11/16.
 */
public class Dog extends Animals {

   public boolean hasTail;

    public Dog () {

//        lifeExpectency = 15;
//        isCarnivore = true;
        super(15,true);
        System.out.println("new dog");
    }

    public void speak() {
        System.out.println("dog barks");
    }

    public void beg() {
        System.out.println("dog begs");
    }

//    public boolean hastail(boolean a) {
//        return true;
//    }

//  public void setHasTail(boolean hasTail){  // Misi made me to put these here I really have no idea why
//      this.hasTail = hasTail;
//  }
//
//  public boolean getHasTail() {
//      return this.hasTail;
//  }



}
