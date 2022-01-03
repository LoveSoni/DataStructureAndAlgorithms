package Recurssion;

public class CountWaysToReachNthStair {
    static int distinctWaysToClimbStair(int stairs){
        if(stairs<0){
            return 0;
        }
        if(stairs == 1){
            return 1;
        }
        return distinctWaysToClimbStair(stairs-1) + distinctWaysToClimbStair(stairs-2);
    }

    public static void main(String[] args) {
        System.out.println(distinctWaysToClimbStair(6));
    }
}
