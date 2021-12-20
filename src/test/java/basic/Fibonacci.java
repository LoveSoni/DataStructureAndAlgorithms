package basic;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c=0, till = 10;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;a+b<till;i++){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
