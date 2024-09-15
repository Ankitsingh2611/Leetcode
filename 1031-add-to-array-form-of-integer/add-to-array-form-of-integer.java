class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int i = n - 1;
        List<Integer> sol = new ArrayList<>();
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i--];
            }
            sol.add(0, k % 10);
            k /= 10;
        }
        return sol;
    }
}