package twodimensionalpackage;

public class ColumnWiseSum {
    public static void main(String[] args) {
        int[][] a = {{3,4,11},{2,12,1},{7,8,7}};
        int sum = 0;
        for(int i=0;i<a[0].length;i++){
            sum =0;
            for(int j=0;j<a.length;j++){
                sum += a[j][i];
            }
            System.out.println("Sum of "+(i+1)+" row is : "+sum);
        }
    }
}
