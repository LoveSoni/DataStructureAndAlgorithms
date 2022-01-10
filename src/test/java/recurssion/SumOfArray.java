package recurssion;

public class SumOfArray {
    // find the sum of array using recursion
    public static int arraySum(int array[]) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int[] arrayNew = new int[array.length - 1];
        System.arraycopy(array, 1, arrayNew, 0, arrayNew.length);
        int sum = array[0] + arraySum(arrayNew);
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {4, 3, 7, 3};
        System.out.println(arraySum(array));
    }
}
