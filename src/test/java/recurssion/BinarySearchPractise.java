package recurssion;

public class BinarySearchPractise {
    public static void main(String[] args) {
        int[] array = {34,45,57,89,91};
        int start = 0;
        int index = -1;
        int key = 89;
        int end = array.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(key == array[mid]){
                index = mid;
            }
            if(key>array[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
            mid = (start+end)/2;
        }
        System.out.println(index);
    }
}
