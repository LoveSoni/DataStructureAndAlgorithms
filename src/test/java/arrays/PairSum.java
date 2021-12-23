package arrays;

public class PairSum {
    /*
    Array and sum is given
    array = {1,2,3,4,5}
    sum = 5
    we have to find the pairs from the above array
     */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int sum = 5;
        for(int i=0;i<a.length;i++){
            for(int j= i+1;j<a.length;j++){
                System.out.println(a[i]+","+a[j]);
                if(a[i]+a[j] == sum){
                    System.out.println("Pairs {"+a[i]+","+a[j]+"}");
                }
            }
        }
    }
}
