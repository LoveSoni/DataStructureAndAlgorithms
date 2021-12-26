package binarysearch;

public class PeakIndexInMountainArray {
    /*  Mountains array will look like:
        a[] = {3,4,5,1}
     */
    public static void main(String[] args) {
        int []a = {3,4,5,12};
        int start = 0;
        int end = a.length-1;
        int mid = (start + end)/2;
        while(start<end){
            if(a[mid] < a[mid+1]){
                start = mid+1;
            }
            else{
                 end =  mid;
            }
            mid = (start+end)/2;
        }
        System.out.println("Peak element" + start);

    }
}
