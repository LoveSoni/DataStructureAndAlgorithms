package Recurssion;

public class Fibonacci {

    public static int getSpcecifiFibo(int number){
        if(number==0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return getSpcecifiFibo(number -1 )+ getSpcecifiFibo(number-2);
    }

    public static void main(String[] args) {
        System.out.println(getSpcecifiFibo(6));
    }
}
