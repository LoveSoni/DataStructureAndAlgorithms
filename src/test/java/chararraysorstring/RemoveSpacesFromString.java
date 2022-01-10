package chararraysorstring;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String string = "my name is love soni";
        char[] charArray = string.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]==' '){
                charArray[i] = '@';
            }
        }
        string = new String(charArray);
        System.out.println(string);
    }
}
