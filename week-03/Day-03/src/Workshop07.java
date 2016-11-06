/**
 * Created by zsofiaprincz on 04/11/16.
 */
public class Workshop07 {
    public static void main(String[] args) {
        // What's the problem with this code fragment? Fix it!
        int[] array = new int[] {2,3,4,5,6,7,8}; // set up array properly and defined values
        for (int i = 0; i < array.length; i++) //modified the legth to the length of the array
            array[i] = i * i;
        System.out.println(array[5]); //printed out randomly the 6th element
    }


}
