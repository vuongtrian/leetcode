package ArrayAndHashing;

/*
* Given an array of strings strs, group the anagrams together. You can return the answer in any order.
* An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
*
* Input: strs = ["eat","tea","tan","ate","nat","bat"]
* Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
*
* Input: strs = [""]
* Output: [[""]]
*
* Input: strs = ["a"]
* Output: [["a"]]
* */

import java.util.*;

public class prob_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<Integer>> mapStore = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = "";
            if (strs[i].equals("")) {
                str = strs[i];
            } else {
                char[] temp = strs[i].toCharArray();
                Arrays.sort(temp);
                str = new String(temp);
            }

            List<Integer> temp = new ArrayList<>();
            if (!mapStore.containsKey(str)) {
                temp.add(i);
                mapStore.put(str, temp);
            } else {
                temp = mapStore.get(str);
                temp.add(i);
                mapStore.put(str, temp);
            }
        }

        for (String key : mapStore.keySet()) {
            List<String> temp = new ArrayList<>();
            System.out.println("Key: " + key + " - " + mapStore.get(key));
            for (int i : mapStore.get(key)) {
                temp.add(strs[i]);
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs).toString());
    }

}
