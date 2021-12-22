package arrays;

public class LinearSearch {
    // check if number is present in array or not
    public static void main(String[] args) {
        int num = 4;
        boolean res = false;
        int []array = {23,34,56,68,89,32};
        for (int j : array) {
            if (j == num) {
                res = true;
            }
        }
        if(res){
            System.out.println("Number is present in array");
        }
        else{
            System.out.println("Number is not present in array");
        }
    }
}
