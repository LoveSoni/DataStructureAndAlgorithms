package chararraysorstring;


public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String string = "abbaca";
        char[] ch = string.toCharArray();
        for (int i = 0; i + 1 < ch.length; i++) {
            if (ch[i] == ch[i + 1]) {
                ch = constructArray(ch, i, i + 1);
                i = -1;
            }
        }
        System.out.println(new String(ch));
    }


    public static char[] constructArray(char[] ch, int firstIndex, int secondIndex) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if (!(i == firstIndex || i == secondIndex)) {
                sb.append(ch[i]);
            }
        }
        return sb.toString().toCharArray();
    }

}
