class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int lie = matrix[0].length;
        int hang = matrix.length;
        int row = 0;
        int col = lie - 1;
        while (row <= hang - 1 && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else {//相等
                row++;
            }
        }
        return false;

    }
}