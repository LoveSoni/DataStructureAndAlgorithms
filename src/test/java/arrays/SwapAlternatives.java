package arrays;

public class SwapAlternatives {
    /*
            [2,3,4,5,6,7]
            after swapping alternative output will be:
      output:  [3,2,5,4,7,6]
     */
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int temp, start=0, end= 1;
        for(int i=0;i<a.length;i++){
            if(!(end>=a.length)){
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start = start+2;
                end = end +2;
            }

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
