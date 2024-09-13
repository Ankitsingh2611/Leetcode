class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
       
        for(int i = 0; i<nums.length; i++){
             int temp =0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] < nums[i]){
                    temp++;
                    
                }
            }
            ans[i] = temp;
        }
        return ans;
    }
}