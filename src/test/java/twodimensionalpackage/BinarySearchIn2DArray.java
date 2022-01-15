package twodimensionalpackage;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        // Condition : 2D array should be sorted
        int[][] array ={{1,2,3},{4,5,6}};
        int start = 0;
        int element = 4;
        // end = (row * column) - 1
        int end = (array.length * array[0].length) -1 ;
        int index = -1;
        int mid = (start+end)/2;
        // or mid = start + (end - start)/2;
        for (int i=0; start<=end; i++){
            // matrix will be matrix = array[mid/column][mid%column];
            int matrix = array[mid/array[0].length][mid%array[0].length];
            if(element == matrix){
                index = mid;
            }
            if(element>matrix){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
            mid = (start+end)/2;
        }
        System.out.println(index);
    }
}
