package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    /*
    {1,2,3,4,3};
     Duplicate number: 3
     */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,3,2,1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.get(a[i])!=null){
               int value =  map.get(a[i]);
               ++value;
                map.put(a[i],value);
            }
            else{
                map.put(a[i],1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> newMap : map.entrySet()){
            if(newMap.getValue()>1){
                System.out.println("Duplicate value "+newMap.getKey());
            }
        }
    }
}
