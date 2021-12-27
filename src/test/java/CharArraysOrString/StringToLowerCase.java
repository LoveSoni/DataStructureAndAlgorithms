package CharArraysOrString;

public class StringToLowerCase {
    // e.g. we've the following string give
    // string = Love
    // we want to convert this to lowercase
    // we can do this in following steps
    // step1: convert string to character array
    // step2: Now iterate over each character and do the following operation
    // Step 3:character - 'A' + 'a'

    public static void main(String[] args) {
        String string = "LoVe";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = charToLowerCase(charArray[i]);
        }
        string = new String(charArray);
        System.out.println(string);
    }

    public static char charToLowerCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return ch;
        } else {
            return (char) (ch - 'A' + 'a');
        }
    }

}
