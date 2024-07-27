import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (indices.containsKey(target - num)) {
                return new int[] { i, indices.get(target - num) };
            }
            indices.put(num, i);
        }

        return new int[] {};        
    }
}