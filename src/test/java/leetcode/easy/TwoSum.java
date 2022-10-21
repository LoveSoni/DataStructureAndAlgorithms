package leetcode.easy;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int nums[], int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                list.add(i);
                list.add(map.get(target - nums[i]));
            }
            else{
                map.put(nums[i],i);
            }
        }
       return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
    }
}
