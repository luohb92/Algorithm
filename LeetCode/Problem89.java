package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem89 {
    /**
     * 二进制转成格雷码有一个公式。
     */
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i < (1 << n); i++){
            res.add(i ^ (i >> 1));
        }
        return res;
    }
}
