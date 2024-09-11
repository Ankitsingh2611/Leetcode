class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;  // Initialize the maximum wealth as 0
        int sum = 0;  // This will store the sum of the wealth of each customer

        // Loop through each customer's account
        for (int i = 0; i < accounts.length; i++) {
            // Sum the wealth of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            // Update max if the current customer's wealth is greater than the current max
            if (sum > max) {
                max = sum;
            }
            // Reset the sum for the next customer
            sum = 0;
        }

        // Return the maximum wealth across all customers
        return max;
    }
}
