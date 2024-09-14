class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
    if (original.length != m * n) {
        return new int[0][0];
    }

    int[][] result = new int[m][n];

    for (int i = 0; i < original.length; i++) {
        int r = i / n;
        int c = i % n;
        result[r][c] = original[i];
    }

    return result;
    }
}