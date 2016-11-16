import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 15/11/16.
 */
public class Student extends Person {

    private ArrayList<Integer> grades;

    public Student(String name, int age) {  // elso megoldas, mert amig ez nincs benn addig a class constructor piros volt es kell definialni az ososztaly konstrukturaban a valtozokat.
        super(name, age);
    }

    public void addGrade (int grade){
    grades.add(grade); }

    public double getAverage (){
        double sum = 0;
        for (int grade:grades) {
            sum += grade;
        }
    return sum / grades.size();}

    @Override
    public String toString() {
        return super.toString() + " and his average is" +getAverage();
    }
}

//
//    private ArrayList<Integer> grades = new ArrayList<>() nem annyira elegans ezert van a konstruktor h ilyen ne legyen

