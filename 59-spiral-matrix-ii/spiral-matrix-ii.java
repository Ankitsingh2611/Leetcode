class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int left = 0, right = n - 1, top = 0, down = n - 1, index = 1;
        while (left <= right && top <= down) {
            for (int j = left; j <= right; j++) {
                ans[top][j] = index;
                index++;
            }
            top++;
            for (int i = top; i <= down; i++) {
                ans[i][right] = index;
                index++;
            }
            right--;
            if (top <= down) {
                for (int j = right; j >= left; j--) {
                    ans[down][j] = index;
                    index++;
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    ans[i][left] = index;
                    index++;
                }
                left++;
            }
        }
        return ans;
    }
}