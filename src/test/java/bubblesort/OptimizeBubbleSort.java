package bubblesort;

public class OptimizeBubbleSort {
    /*
          Lets say if in first round we did not arrange element
          , then it means that array was already sorted so can stop the other rounds

         How to do tha?
         with the help of a boolean variable
     */

    public static void main(String[] args) {
        int[] array = {29, 72, 98, 13, 87, 66, 52, 51, 36};
        for (int i = 1; i < array.length; i++) {
            boolean res = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    res = true;
                }
            }
            if(res == false){// already sorted
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
