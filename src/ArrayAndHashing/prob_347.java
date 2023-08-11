package ArrayAndHashing;

/*
* Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
*
* Input: nums = [1,1,1,2,2,3], k = 2
* Output: [1,2]
*
* Input: nums = [1], k = 1
* Output: [1]
* */

import java.util.*;

public class prob_347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashNum = new HashMap<>();

        for (int i : nums) {
            if (!hashNum.containsKey(i)) {
                hashNum.put(i, 1);
            } else {
                hashNum.put(i, hashNum.get(i) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> listValues = new ArrayList<>(hashNum.entrySet());
        listValues.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : listValues) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        int[] result = new int[k];
        int index = 0;
        for(int key : sortedMap.keySet()) {
           if(index >= result.length) {
               break;
           }
           result[index] = key;
           index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
//        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] res = topKFrequent(nums, k);
        for(int i : res) {
            System.out.println(i);
        }
    }
}
