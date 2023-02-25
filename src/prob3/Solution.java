package prob3;

/*
* Given a string s, find the length of the longest substring without repeating characters.
* Input: s = "abcabcbb"
* Output: 3
* Explanation: The answer is "abc", with the length of 3.
*
* Input: s = "pwwkew"
* Output: 3
* Explanation: The answer is "wke", with the length of 3.
* Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
* */

import java.util.HashSet;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        HashSet<Character> sets = new HashSet<>();
        while (right < s.length()) {
            if(!sets.contains(s.charAt(right))) {
                sets.add(s.charAt(right));
                max = Math.max(sets.size(), max);
                right++;
            } else {
                sets.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
