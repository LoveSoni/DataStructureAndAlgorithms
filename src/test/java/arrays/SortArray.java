package arrays;

public class SortArray {
    // sort array in ascending or descending order
    public static void main(String[] args) {
        int[] a = {4, 34, 2, 5, 23, 56};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int j : a) {
            System.out.println(j);
        }
    }
}
