package basic;

public class SpecificFibonacciNumber {
    public static long getSpecificFiboNumber(long num){
        long a = 0, b =1;
        long c = 0;
        for(int i=3;i<=num;i++){
            c = a+b;
            a =b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(getSpecificFiboNumber(15));
    }
}
