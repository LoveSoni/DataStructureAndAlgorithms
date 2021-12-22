package arrays;


public class MaxAndMin {
    /*
        Find max and min number from an array
        [1,0,33,4,5]
        Max - 33
        Min- 0
     */
    public static void main(String[] args) {
        int []a = {1,0,33,4,5};
        int big= Integer.MIN_VALUE,small= Integer.MAX_VALUE;
        for (int j : a) {
            if (big < j) {
                big = j;
            }
            if(small>j){
                small = j;
            }
        }
        System.out.println(big);
        System.out.println(small);

    }
}
