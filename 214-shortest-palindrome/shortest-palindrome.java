class Solution {
    public String shortestPalindrome(String s) {
         String rev = new StringBuilder(s).reverse().toString();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.startsWith(rev.substring(i))) {
                return rev.substring(0, i) + s;
            }
        }
        return "";
    }
}