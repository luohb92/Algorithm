/**
 * 二维数组中查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 样例
 * 输入数组：
 *
 * [
 *   [1,2,8,9]，
 *   [2,4,9,12]，
 *   [4,7,10,13]，
 *   [6,8,11,15]
 * ]
 *
 * 如果输入查找数值为7，则返回true，
 *
 * 如果输入查找数值为5，则返回false。
 */
package offer;

public class Problem04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        if(n == 0) {
            return false;
        }
        int m = matrix[0].length;
        int i = n -1;
        int j = 0;
        while(i >= 0 && j < m) {
            if(matrix[i][j] > target) {
                --i;
            } else if(matrix[i][j] < target) {
                ++j;
            } else {
                return true;
            }
        }
        return false;
    }

}
