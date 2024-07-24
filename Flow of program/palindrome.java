public class palindrome {
    public static void main(String[] args) {
        String input = "madam"; // input string
        boolean isPalindrome = isPalindrome(input);
        System.out.println(input + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}