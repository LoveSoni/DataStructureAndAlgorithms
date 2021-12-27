package CharArraysOrString;

import java.util.HashMap;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String str = "love soni";
        char ch[] = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<ch.length;i++){
            if(map.get(ch[i])!=null){
                int value = map.get(ch[i]);
                ++value;
                map.put(ch[i],value);
            }
            else{
                map.put(ch[i],1);
            }
        }
        System.out.println(map);
    }
}
