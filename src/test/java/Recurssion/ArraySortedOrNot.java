package Recurssion;

public class ArraySortedOrNot {
    // An array is given we need to check whether it is sorted or not
    // array[] = {1,2,4,5,6}
    // output: true
    // using loop we can solve like this:
    /*
          boolean res = false;
        for(int i=0;i<array.length-1;i++){
            if(array[i] < array[i+1]){
                res = true;
            }
            else {
                res = false;
            }
        }
        System.out.println(res);
     */


    // if we want to do this using recursion then need to perform following steps
    // Base condition: if(array.length == 0 || array.length == 1){ return true}// because array is already sorted
    // if(array[0] > array[1]){return false} // because then it is not sorted
    // recursive relation: else{
    //  create a new array which will start from the first index e,g,
//    int[] array = {1,3,4,5,1};
//    int[] arraynew = new int[array.length-1];
//        for(int i=0;i<arraynew.length;i++){
//        arraynew[i] = array[i+1];
//    }
    // return isSorted(arrayNew); // and pass the new array}
    public static boolean isSorted(){
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,5,1};
        int[] arraynew = new int[array.length-1];
        for(int i=0;i<arraynew.length;i++){
            arraynew[i] = array[i+1];
        }
        for(int c: arraynew){
            System.out.print(c);
        }
    }
}
