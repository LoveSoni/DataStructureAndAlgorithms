package Recurssion;

public class BinarySearch {
//    int[] array = {2,3,4,5,6,7,8};
//    int start = 0 ; int key = 6;
//    int end = array.length-1;
//    int mid = (start+end)/2;
//    int index = -1;
//        for(int i=0;start<=mid;i++){
//        if(array[mid] == key){
//            index = mid;
//        }
//        if(key> array[mid]){
//            start = mid+1;
//        }
//        else{
//            end = mid-1;
//        }
//        mid = (start+end)/2;
//    }

    public static int searchIndexUsingBinarySearch(int[] array, int start,int end, int key){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(array[mid] == key){
            return mid;
        }
        if(key> array[mid]){
            start = mid+1;
            return searchIndexUsingBinarySearch(array,start,end,key);
        }
        else{
            end = mid-1;
            return searchIndexUsingBinarySearch(array,start,end,key);
        }
    }

    public static void main(String[] args) {
        int[] array = {2,3,5,7,8,9};
        System.out.println(searchIndexUsingBinarySearch(array,0,array.length-1,7));
    }
}
