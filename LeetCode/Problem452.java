package LeetCode;

import java.util.Arrays;

public class Problem452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, ((o1, o2) -> Integer.compare(o1[0], o2[0])));
        //points 不为空至少需要一支箭
        int res = 1;

        for(int i = 1; i < points.length; ++i) {
            if(points[i][0] > points[i-1][1]) {
                // 气球i和气球i-1不挨着，注意这里不是>=
                //需要一支箭
                ++res;
            } else {
                // 更新重叠气球最小右边界
                points[i][1] = Math.min(points[i-1][1], points[i][1]);
            }
        }
        return res;
    }
}
