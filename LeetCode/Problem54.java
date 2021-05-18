package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        int start_x = 0;
        int start_y = 0;
        int top = -1;
        int left = -1;
        int right = matrix[0].length;
        int bottom = matrix.length;
        //0 向右， 1向下， 2向左， 3向上
        int direction = 0;
        while(true) {
            if (res.size() == matrix.length * matrix[0].length) {
                return  res;
            }
            res.add(matrix[start_y][start_x]);
            switch (direction) {
                case 0:
                    if (start_x + 1 == right) {
                        direction = 1;
                        start_y += 1;
                        top += 1;
                    } else {
                        start_x += 1;
                    }
                    break;
                case 1:
                    if (start_y + 1 == bottom) {
                        direction = 2;
                        start_x -= 1;
                        right -= 1;
                    } else {
                        start_y += 1;
                    }
                    break;
                case 2:
                    if (start_x -1 == left) {
                        direction = 3;
                        start_y -= 1;
                        bottom -= 1;
                    } else {
                        start_x -= 1;
                    }
                    break;
                case 3:
                    if (start_y -1 == top) {
                        direction = 0;
                        left += 1;
                        start_x +=1;
                    } else {
                        start_y -= 1;
                    }
                    break;
            }
        }
    }
}
