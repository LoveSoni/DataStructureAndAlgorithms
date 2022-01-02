package Recurssion;

public class ReverseCountingUsingHeadRecursion {
    public static void printCounting(int num){
        if(num<1){
            return;
        }
        printCounting(num-1);
        System.out.println(num+ "\t");
    }

    public static void main(String[] args) {
        printCounting(15);
    }
}
