/**
 *
 */
package LeetCode;

public class Problem63 {
    public static void main(String[] args) {

    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j< m; ++j) {
                if(obstacleGrid[i][j] == 1) {
                    continue;
                }
                if(i == 0 && j == 0) {
                    dp[i][j] = 1;
                }
                if(i > 0) {
                    dp[i][j] += dp[i-1][j];
                }
                if(j > 0) {
                    dp[i][j] += dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
}
