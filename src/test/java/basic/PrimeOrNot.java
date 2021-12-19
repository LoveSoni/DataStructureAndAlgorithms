package basic;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number = 13;
        boolean IsPrime = true;
        for(int i=2;i<number;i++){
            if(number % i ==0){
                IsPrime = false;
                break;
            }
        }
        if(IsPrime){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
