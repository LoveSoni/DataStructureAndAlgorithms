package binarysearch;

public class FirstAndLastOccurrence {
    /*
    An array is given
    array: {0,1,1,5}
    key: 1
        First index = 1
        Last index = 2
     */
    public static void main(String[] args) {
        int[]a = {0,1,1,5};
        int key = 5;
        int index = -1;
        int start=0;
        int end = a.length-1;
        int mid = (start+end)/2;
        for(int i=0;start<=end;i++){
            if(key == a[mid]){
                index = mid;
            }
            if(key>mid){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        System.out.println(index);
    }
}
