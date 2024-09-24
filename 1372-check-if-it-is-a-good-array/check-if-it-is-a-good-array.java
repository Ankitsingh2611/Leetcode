class Solution {
    public boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
            ans = gcd(ans, nums[i]);
        }
        return ans == 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}