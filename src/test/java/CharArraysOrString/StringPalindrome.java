package CharArraysOrString;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "love soni";
        int start = 0;
        int end = str.length()-1;
        char temp;
        char[] reversedChar = str.toCharArray();
       while(start<=end){
            temp = reversedChar[start];
            reversedChar[start] = reversedChar[end];
            reversedChar[end] = temp;
            start++;
            end--;
        }
        String reversedString = new String(reversedChar);
        if(str.equals(reversedString)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
