package CharArraysOrString;

public class RemoveAllOccurrenceOfSubString {
    /*
    e.g. we have following string:
    daabcbaabcbc
    and substring given is abc
    we've to remove the substring from the main string
     */
    public static void main(String[] args) {
        String string = "daabcbaabcbc";
        String subString = "abc";
        System.out.println(string.replaceAll("abc",""));
    }
}
