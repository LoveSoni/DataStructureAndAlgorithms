package binarysearch;

public class BinarySearchExample {
    //use binary search to find any element
    // and return the index if it exists
    //  and return the index if it exists
    // Prerequisite: arrays should be in ascending/descending order
    public static void main(String[] args) {
        int[] evenArray = {2,4,6,8,12,18,20};
        int key =4;
        int matchIndex = -1;
        int start = 0;
        int end = evenArray.length-1;
        int mid = (start+end)/2;
        for(int i=0;start<=end;i++){
            System.out.println("inside loop");
            if(key == evenArray[mid]){
                matchIndex = mid;
            }
            if(key>evenArray[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        System.out.println(matchIndex);
    }
}
