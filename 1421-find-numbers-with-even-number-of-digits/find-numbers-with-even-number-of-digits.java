class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = countDigits(num);
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}