/**
 * Created by zsofiaprincz on 16/11/16.
 */
public class Mentor extends Person {
    private String seniorityLevel;
    private String subject;

    public  Mentor(String name, int age, String seniorityLevel, String subject){
        super (name,age);
        this.seniorityLevel = seniorityLevel;
        this.subject = subject;
    }
}
