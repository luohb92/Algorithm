package LeetCode;

public class Problem59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = -1;
        int right = n;
        int left = -1;
        int bottom = n;
        int direction = 0;
        int startX = 0;
        int startY = 0;
        int count = 1;
        while (true) {
            if (count == n * n + 1) {
                return res;
            }
            res[startY][startX] = count;
            count += 1;
            switch (direction) {
                case 0:
                    if (startX + 1 == right) {
                        direction = 1;
                        startY += 1;
                        top += 1;
                    } else {
                        startX +=1;
                    }
                    break;
                case 1:
                    if (startY + 1 == bottom) {
                        direction = 2;
                        startX -= 1;
                        right -= 1;
                    } else {
                        startY += 1;
                    }
                    break;
                case 2:
                    if (startX - 1 == left) {
                        direction = 3;
                        startY -= 1;
                        bottom -= 1;
                    } else {
                        startX -= 1;
                    }
                    break;
                case 3:
                    if (startY - 1 == top) {
                        direction = 0;
                        startX += 1;
                        left += 1;
                    } else {
                        startY -= 1;
                    }
                    break;
            }

        }
    }
}
