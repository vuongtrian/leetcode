package ArrayAndHashing;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class prob_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapNums.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (mapNums.containsKey(temp) && mapNums.get(temp) != i) {
                return new int[]{i, mapNums.get(temp)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
