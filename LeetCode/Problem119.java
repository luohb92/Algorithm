/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        list0.add(1);
        res.add(list0);
        for (int i = 1; i <= rowIndex; ++i) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> preList = res.get(i - 1);
            for (int j = 1; j < i; ++j) {
                list.add(preList.get(j) + preList.get(j - 1));
            }
            list.add(1);
            res.add(list);
        }
        return res.get(rowIndex);
    }
}
