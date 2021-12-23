package arrays;

public class ArrayIntersection {
    /*
    {1,2,3}
    {3,4}
     output : 3, because it is common
     */
    public static void main(String[] args) {
        int[] firstArray =  {1,2,3};
        int[] secondArray = {3,4};

        for(int i=0;i<firstArray.length;i++){
            for(int j=0;j<secondArray.length;j++){
                if(firstArray[i] == secondArray[j]){
                    System.out.println(firstArray[i]);
                    secondArray[j] = Integer.MIN_VALUE;
                    // i've added Min_Value so that now it should not be mapped with any other number
                }
            }
        }
    }
}
