package arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {
    /*
    find a unique number from the given array
     */
    public static void main(String[] args) {
        int []a = {1,2,3,3,3,2,1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.get(a[i])!=null){
               int value = map.get(a[i]);
               ++value;
                map.put(a[i],value);
            }
            else{
                map.put(a[i],1);
            }
        }  System.out.println(map);
        for(Map.Entry<Integer,Integer> newMap: map.entrySet()){
            if(newMap.getValue()==1){
                System.out.println("Unique number is: "+newMap.getValue());
            }
        }

    }
}
