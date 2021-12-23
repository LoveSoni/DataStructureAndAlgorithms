package arrays;

public class TripletWithGivenSum {
    /*
      array = [2,3,4,5,6,7]
       sum = 12
      output: 3 pairs whose sum = 12
     */

    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        int sum = 12;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                  //  System.out.println  (a[i]+","+a[j]+","+a[k]);
                    if(a[i]+a[j]+a[k] == sum){
                        System.out.println("{"+a[i]+","+a[j]+","+a[k]+"}");
                    }
                }
            }
        }
    }
}
