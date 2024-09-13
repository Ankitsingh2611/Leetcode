class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        int index = 0;
        ListNode current = head;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Print top row from left to right
            for (int i = left; i <= right; ++i) {
                if (current != null) {
                    matrix[top][i] = current.val;
                    current = current.next;
                    index++;
                } else {
                    matrix[top][i] = -1; // or some default value
                }
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; ++i) {
                if (current != null) {
                    matrix[i][right] = current.val;
                    current = current.next;
                    index++;
                } else {
                    matrix[i][right] = -1; // or some default value
                }
            }
            right--;

            // Print bottom row from right to left (if exists)
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    if (current != null) {
                        matrix[bottom][i] = current.val;
                        current = current.next;
                        index++;
                    } else {
                        matrix[bottom][i] = -1; // or some default value
                    }
                }
                bottom--;
            }

            // Print left column from bottom to top (if exists)
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    if (current != null) {
                        matrix[i][left] = current.val;
                        current = current.next;
                        index++;
                    } else {
                        matrix[i][left] = -1; // or some default value
                    }
                }
                left++;
            }
        }

        return matrix;
    }
}