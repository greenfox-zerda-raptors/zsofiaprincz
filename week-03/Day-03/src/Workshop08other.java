
public class Workshop08other {
    /**
     * Created by zsofiaprincz on 04/11/16.
     */


        public static void main(String[] args) {
            // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
            // 1 0 0 0
            // 0 1 0 0
            // 0 0 1 0
            // 0 0 0 1

            // Task 2: Print this two dimensional array to the output

            //  int[][] array = new int[][] {{},{},{},{}};
            /* meg csak azt mondtam meg h van egy nagy dobozom: kulso kapcsos zarojel
                                                           es abban vannak meg dobozok: belso kapcsos zarojel */

            //  int[][] array = new int[][] {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}}; /*igy kell kineznie */

            int[][] multi = new int[4][4];
//            multi[0][0] = 1;
//            multi[1][1] =1; //azt akarom h a sor es az oszlop indexe azonos akkor 1 legyen az erteke (value)
            for (int row = 0; row < multi.length; row++) {
                for (int column = 0; column < multi[row].length; column++) {
                    if (multi[column] == multi[row]) {
                        multi[row][column] = 1;

                    }
                    System.out.print(multi[row][column]+ " ");
                }
                System.out.println();
            }



        }
    }


