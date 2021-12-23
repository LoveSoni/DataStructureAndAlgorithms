package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurance {
    /*
    {1,2,2,1,1,3}
    1 -> 3
    2 -> 2
    3 -> 1
        if the above occurrence of number is unique
        then return true, else return false
     */
    public static void main(String[] args) {
        int[] myArray =  {1,2,2,1,1,3};
        System.out.println(uniqueOccuranceOrNot(myArray));
    }

    public static boolean uniqueOccuranceOrNot(int a[]){
        boolean res = false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : a) {
            if (map.get(j) != null) {
                int value = map.get(j);
                ++value;
                map.put(j, value);
            } else {
                map.put(j, 1);
            }
        }
        System.out.println(map);
        // now convert map to set because it only contains unique elements
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> nMap: map.entrySet()){
            set.add(nMap.getValue());
        }
        return map.size() == set.size();
    }
}
