package arrays;

public class ReverseArray {
    /*
        [1,2,3,4,5]
        output should be a reversed array
        [5,4,3,2,1]
     */
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int temp = 0,start=0, end = a.length-1;
        for(int i=0;i<a.length;i++){
            if(start<end) {
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }else{
                break;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
