/**
 * Created by zsofiaprincz on 03/11/16.
 */
public class Workshop37 {
    public static void main(String[] args) {
        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replacable, hence store it in a variable

        String hashtag = "#";
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < 13; j++) {
                if (j % 2 != 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(hashtag);
                }



            }

            System.out.println();

        }


    }
}



