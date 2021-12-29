package twodimensionalpackage;

public class WavePrint {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 5}, {3, 4, 6}, {7, 8, 9}};
        int wave = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = wave; j < array.length; j++) {
                System.out.print(array[j][i]);
            }
        }
    }
    /*
            1 2 5
            3 4 6
            7 8 9
     */
}