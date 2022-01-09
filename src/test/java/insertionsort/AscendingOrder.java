package insertionsort;

public class AscendingOrder {
    public static void main(String[] args) {
        int [] array = {10,1,7,4,8,2,11};
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            for(;j>=0;j--){
                if(array[j]>temp){
                    array[j+1] = array[j];
                }
                else{
                    break;
                }
            }
            array[j+1] = temp;
        }
        for(int a: array){
            System.out.println(a);
        }
    }
}
