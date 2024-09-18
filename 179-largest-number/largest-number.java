class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort strings using custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare a + b and b + a to determine the correct order
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab);
            }
        });

        // Join sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }

        // Remove leading zeros if any
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Largest number: " + solution.largestNumber(nums));
    }
}