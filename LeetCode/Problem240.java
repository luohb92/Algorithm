/**
 * 搜索二维矩阵 II
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列
 */
package LeetCode;

public class Problem240 {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m -1, j = 0;
        while(i > -1 && j < n) {
            if(matrix[i][j] == target) {
                return true;
            } else if(matrix[i][j] > target) {
                --i;
            } else {
                ++j;
            }
        }
        return false;
    }

}
