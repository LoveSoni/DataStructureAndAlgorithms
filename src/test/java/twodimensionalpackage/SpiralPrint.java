package twodimensionalpackage;

public class SpiralPrint {
    /*
    Input:  1    2   3   4
            5    6   7   8
            9   10  11  12
            13  14  15  16
    Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
     */
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int startRow = 0;
        int startColumn = a[0].length - 1;
        int endRow = a[0].length - 1;
        int endColumn = 0;
        //print starting row
        for (int i = 0; i <=0; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        //print ending column
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j]);
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            for (int j = a[0].length - 1; j >= 0; j--) {
//                System.out.print(a[i][j]);
//            }
//        }
    }
}
