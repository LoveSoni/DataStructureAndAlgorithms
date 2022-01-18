package basic;

public class PrimeNumbersBetween {
    public static void main(String[] args) {
        int number = 40;
        for (int i = 2; i < number; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime(int number) {
        boolean isPrime = false;
        for(int i=2;i<number;i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
            else{
                isPrime = true;
            }
        }
        return isPrime;
    }
}
