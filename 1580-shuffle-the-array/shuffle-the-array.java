class Solution {
  public int[] shuffle(int[] nums, int n) {
    int[] ans = new int[2 * n];
    
    int left = 0;   // Pointer 1: points to the first element of the first half
    int right = n;  // Pointer 2: points to the first element of the second half
    
    for (int i = 0; i < 2 * n; i += 2) {
      ans[i] = nums[left];      // Place element from the first half
      ans[i + 1] = nums[right]; // Place element from the second half
      left++;  // Move pointer 1 to the next element in the first half
      right++; // Move pointer 2 to the next element in the second half
    }
    
    return ans;
  }
}
