package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/two-sum/
/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum_BruteForce {

    public static int[] twoSum(int array[], int target) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    newList.add(i);
                    newList.add(j);
                    break;
                }
            }
        }
        System.out.println(newList);
        return newList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        int target = 6;
        System.out.println(twoSum(nums, target));
    }
}
