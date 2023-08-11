package ArrayAndHashing;

/*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*
* Input: nums = [1,2,3,1]
* Output: true
*
* Input: nums = [1,2,3,4]
* Output: false
*
* Input: nums = [1,1,1,3,3,4,3,2,4,2]
* Output: true
* */

import java.util.HashSet;
import java.util.Set;

public class prob_217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();

        for (int n : nums) {
            if(set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbs = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(numbs));
    }

}
