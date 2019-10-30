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
    public static void main(String[] args) {
        int[][] array = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
        int target = 7;
        searchArray(array, target);
    }

    /**
     * 由于数组每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
     * 先比较数组的最左下角的位置和target大小，如果大于target,则行数减1
     * 否则列数加1
     * @param array
     * @param target
     * @return
     */
    public static boolean searchArray(int[][] array, int target) {
        int row = array.length -1;
        int column = 0;
        while (row >= 0 && column < array[0].length) {
            if (array[row][column] == target) {
                return true;
            } else if (array[row][column] > target){
                --row;
            } else {
                ++column;
            }
        }
        return false;
    }

}
