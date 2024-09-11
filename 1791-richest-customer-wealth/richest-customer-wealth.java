class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
      
        // Loop through each customer's account
        for (int[] customerAccounts : accounts) {
            // Sum the wealth of the current customer
            int customerWealth = 0;
            for (int accountBalance : customerAccounts) {
                customerWealth += accountBalance;
            }
          
            // Update maxWealth if the current customer's wealth is greater
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        // Return the maximum wealth across all customers
        return maxWealth;
    }
}