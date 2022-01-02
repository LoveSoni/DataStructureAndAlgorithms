package Recurssion;

public class Counting {
    public static void printCounting(int num){
        if(num<1){
            return;
        }
        else{
            System.out.println(num+ "\t");
            printCounting(num-1);
        }
    }

    public static void main(String[] args) {
        printCounting(15);
    }
}
