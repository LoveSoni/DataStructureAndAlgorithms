package binarysearch;

public class TotalNumberOfOccurrence {
    // array = {1,0,1,1,1,1}
    // find all occurrence of 1 in given array
    // condition: Array should be sorted
    // Steps :
    // a) Find left occurrence of element
    // b) find last occurrence of element
    // c) There is a formulat to find the total number of occurence
    // Total number of occurrence:  (last - start)+1

    //a ) find first occurrence
    public static int indexOfFirstOccurrence(int[] a, int key) {
        int index = -1;
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (key == a[mid]) {
                index = mid;
                end = mid - 1;
            } else if (key > a[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return index;
    }

    public static int indexOfLastOccurrence(int[] a, int key) {
        int index = -1;
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (key == a[mid]) {
                index = mid;
                start = mid + 1;
            } else if (key > a[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return index;
    }


    public static void main(String[] args) {
        int[] a = {0, 1, 1, 1, 1, 1};
        int lastOccurrence = indexOfLastOccurrence(a, 1);
        int firstOccurrence = indexOfFirstOccurrence(a, 1);
        System.out.println(firstOccurrence);
        System.out.println(lastOccurrence);
        // formula to calculate total number of occurrence
        // occurrence = lastOccurrence - firstOccurence +1
        int totalNumberOfOccurrence = (lastOccurrence - firstOccurrence) + 1;
        System.out.println("Total number of occurrence of " + 1 + " is " + totalNumberOfOccurrence);
    }
}
