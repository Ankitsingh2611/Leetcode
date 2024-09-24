class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int minIdx = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIdx = j;
                }
            }
            boolean isTrue = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][minIdx] < matrix[j][minIdx]) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                arr.add(min);
            }
        }
        return arr;
    }
}