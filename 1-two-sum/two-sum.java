import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            numMap.put(nums[i], i);
        }
        
        
        return new int[] {};
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
