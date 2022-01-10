package chararraysorstring;

public class ReverseString {
    public static void main(String[] args) {
        String name = "love soni";
        char[] ch = name.toCharArray();
        int start = 0;
        int end = ch.length -1 ;
        char temp;
        for(int i=0;start<=end;i++){
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start ++; end--;
        }
        for(char c=0;c<ch.length;c++){
            System.out.print(ch[c]);
        }
    }
}
