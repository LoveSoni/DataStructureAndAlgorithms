package Recurssion;

public class Power {

    public static int findPower(int num){
        if(num ==0){
            return 1;
        }
        return 2 * findPower(num-1);
    }
    public static void main(String[] args) {
      System.out.print(findPower(5));
    }
}
