package binarysearch;

public class FirstAndLastOccurrence {
    /*
    An array is given
    array: {0,1,1,5}
    key: 1
        First index = 1
        Last index = 2
     */

    public static void firstOccurrenceOfElement(int []evenArray,int key){
        int matchIndex = -1;
        int start = 0;
        int end = evenArray.length - 1;
        int mid = (start + end) / 2;
        for (int i = 0; start <= end; i++) {
            if (key == evenArray[mid]) {
                matchIndex = mid;
                end = mid -1;
            }
            if (key > evenArray[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println("First occurence of "+key+" is at index "+matchIndex);
    }


    public static void lastOccurrenceOfElement(int []a,int key){
        int index = -1;
        int start = 0;
        int end = a.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(key == a[mid]){
                index = mid;
                start = mid+1;
            }
            else if(key>a[mid]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
            mid = (start+end)/2;
        }
        System.out.println("Last occurrence of "+key +" is at index "+index);
    }

    public static void main(String[] args) {
        int[]a = {0,1,1,5};
        firstOccurrenceOfElement(a,1);
        lastOccurrenceOfElement(a,1);
    }
}
