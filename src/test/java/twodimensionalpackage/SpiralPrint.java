package twodimensionalpackage;

public class SpiralPrint {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int startRow = 0;
        int endRow = a[0].length;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = a[0].length - 1; j >= 0; j--) {
                System.out.print(a[i][j]);
            }
        }
        /*
        1 2 3
        4 5 6
        7 8 9
         */
    }
}
