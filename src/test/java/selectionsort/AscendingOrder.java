package selectionsort;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] array = {29,72,98,13,87,66,52,51,36};
        // here we are doing length-1 because we don't need to do for the last element
        for(int i =0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
