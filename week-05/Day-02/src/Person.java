/**
 * Created by zsofiaprincz on 15/11/16.
 */
public class Person { //extends object

    private String name;
    private int age;

//    public String toString (){
//        return String.format("name=%s,age=%d",
//                name,
//                age);
//
//    }


//    public Person(String name) {   az elso fixe a student extends piros alahuzasnak
//        this.name = name;
//    }

    public Person (String name, int age) {   //ide kell irni a publicot mert kulonben masik packagebol nem latjak
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return name + "("  + age +  ")";
    }
}
