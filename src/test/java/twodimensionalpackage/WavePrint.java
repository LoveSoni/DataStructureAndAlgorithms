package twodimensionalpackage;

public class WavePrint {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 5, 1}, {3, 4, 6, 3}, {7, 8, 9, 7}, {2, 2, 1, 2}};
        int wave = 2;
        for (int i = 0; i < array[0].length; i++) {
            if (wave % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j][i]);
                }
                wave = 3;
            } else {
                for (int j = array.length - 1; j >= 0; j--) {
                    System.out.print(array[j][i]);
                }
                wave = 2;
            }
        }

    /*
            1 2 5 1
            3 4 6 3
            7 8 9 7
            2 2 1 2
     */
    }
}