package basic;

public class Palindrome {
    public static void main(String[] args) {
        int number = 121, temp = number;
        int rev = 0;
        int rem = 0;
        while(number>0){
            rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        System.out.println("Reversed number is : "+rev);

        if(temp == rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome ");
        }

    }
}
