/**
 * Created by zsofiaprincz on 03/11/16.
 */
public class Workshop28 {
    public static void main(String[] args) {
        int z = 13;

        // if z is between 10 and 20 print 'Sweet!'
        // if less than 10 print 'More!',
        // if more than 20 print 'Less!'
        String answer = "";
        if (z >= 10 && z <=20) {
            answer="Sweet";
        } else if (10 > z) {
            answer="More!";
        } else if (20 < z) {
            answer = "Less!";
        }

        System.out.println(answer);
    }
}
