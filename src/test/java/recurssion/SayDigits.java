package recurssion;

public class SayDigits {
    /*
    e.g. 4 1 2
        four one two
     */
    static String numberMappings[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};

    public static void sayDigit(int number){
        if(number == 0){
            return;
        }
        int digit = number % 10;
        number = number/10;
        sayDigit(number);
        System.out.print(numberMappings[digit]+" ");
    }

    public static void main(String[] args) {
        sayDigit(412);
    }
}
