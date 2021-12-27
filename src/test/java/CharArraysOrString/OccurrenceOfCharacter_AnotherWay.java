package CharArraysOrString;

public class OccurrenceOfCharacter_AnotherWay {
    //occurrence of character without using map
    // example our string will be in lower case only
    // step 1: convert string to character array
    // step 2: create an integer array from 0 to 25 where 0 and 25 will represent a and z respectively

    public static void main(String[] args) {
        String string = "output";
        char[] charArray = string.toCharArray();
        int[] intArray = new int[26];
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]>='a' && charArray[i]<='z'){
                int number = 0;
                number = charArray[i] - 'a';
                intArray[number]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<intArray.length;i++){
            if(max<intArray[i]){
                ans = i;
                max = intArray[i];
            }
        }
        System.out.println((char)('a'+ans));
    }
}
