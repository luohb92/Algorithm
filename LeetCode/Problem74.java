/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数
 */
package LeetCode;

public class Problem74 {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n -1;
        while(left < right) {
            int mid = (left + right + 1) >> 1;
            if(matrix[mid / n ][mid % n ] > target) {
                right = mid -1;
            } else {
                left = mid;
            }
        }
        if(matrix[ left / n][left % n] == target) {
            return true;
        }
        return false;
    }
}
