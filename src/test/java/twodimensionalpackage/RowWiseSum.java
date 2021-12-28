package twodimensionalpackage;

public class RowWiseSum {
    public static void main(String[] args) {
        int[][] a = {{3,4,11},{2,12,1},{7,8,7}};
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = 0;
            for(int j=0;j<a[0].length;j++){
                sum += a[i][j];
            }
            System.out.println("Sum of "+i+1+" row is : "+sum);
        }
    }
}
