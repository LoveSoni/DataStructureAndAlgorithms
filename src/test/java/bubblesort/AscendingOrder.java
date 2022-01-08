package bubblesort;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] array = {29,72,98,13,87,66,52,51,36};
        for(int i=1;i<array.length;i++){
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
