/**
 * Created by zsofiaprincz on 17/02/17.
 */

//Create a function that takes an array and a number and shifts the values of the array by the given number like: [1, 2, 3, 4, 5] and 2 becomes [4, 5, 1, 2, 3]
public class Main {

    public void arrayReverser(int original[], int shift) {
        for (int j = 0; j < shift; j++) {
            for (int i = original.length - 1; i > 0; i--) {
                int temp = original[i];
                original[i] = original[i - 1];
                original[i - 1] = temp;

            }

        }
    }
}


