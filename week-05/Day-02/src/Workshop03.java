/**
 * Created by zsofiaprincz on 15/11/16.
 */


    public class Workshop03 {
        public static void main(String... args) {
            Animals animal = new Animals();
            Birds bird = new Birds();
            Dog dog = new Dog();

//            bird.fly();
//            bird.eat();
//            bird.sleep();

            System.out.println("Testing Animal");
            animal.speak();
            animal.sleep();
            dog.hasTail = true;
            System.out.println(animal.toString());
//            Animals.toString(true,10));
            // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore

            System.out.println("\nTesting Bird");
            bird.speak();
            bird.sleep();
            bird.fly();
            System.out.println("And a bird: " + bird.toString());
            // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore

            System.out.println("\nTesting Dog");
            dog.hasTail = true;
            dog.speak();
            dog.sleep();
            dog.beg();
            dog.hasTail = true;
            System.out.println(dog.toString() + ", and hasTail=" + ((Dog) dog).hasTail);


            // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?


            System.out.println("\nTesting Dog2");
            Animals dog2 = new Dog();
            dog2.speak();
            dog2.sleep();
            ((Dog)dog2).beg();
            ((Dog)dog2).hasTail = false;
            dog2.lifeExpectency = 22;
            System.out.println(dog2.toString() + ", and hasTail=" + ((Dog)dog2).hasTail);

            // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

            System.out.println("\nTesting Dog 'd'");
            Animals d = new Dog();
            d.speak();
            d.sleep();
            System.out.println(d.toString());



            // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

        }
    }



