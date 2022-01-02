package twodimensionalpackage;

public class RotateMatrixBy90Degree {
    /*Input:
    1 2 3
    4 5 6
    7 8 9
    Output:
    7 4 1
    8 5 2
    9 6 3`
*/
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a[0].length; i++) {
            for (int j = a.length-1; j >=0; j--) {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
    }

}
