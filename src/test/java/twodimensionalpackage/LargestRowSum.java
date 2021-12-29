package twodimensionalpackage;

public class LargestRowSum {
    public static void main(String[] args) {
        int[][] a = {{3,4,11},{2,22,1},{7,8,7}};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = 0;
            for(int j=0;j<a[0].length;j++){
                sum +=a[i][j];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println("Largest sum is : "+ max);
    }
}
