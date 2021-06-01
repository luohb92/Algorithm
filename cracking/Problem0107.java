package cracking;

public class Problem0107 {
    /**
     * 先按照对角线交换，然后按照中轴线交换
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j <= i; ++j) {
                if(i == j) {
                    continue;
                }
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int k = 0; k < matrix.length; ++k) {
            for(int i = 0, j = matrix.length -1; i < matrix.length / 2; ++i, --j) {
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;

            }
        }
    }
}
