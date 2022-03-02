package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Problem506 {
    public String[] findRelativeRanks(int[] score) {
        String[] ss = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        int n = score.length;
        String[] res = new String[n];
        int[] clone = score.clone();
        Arrays.sort(clone);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = n-1; i >= 0; --i) {
            map.put(clone[i], n-1-i);
        }
        for(int i = 0; i < n; ++i) {
            int rank = map.get(score[i]);
            if(rank < 3) {
                res[i] = ss[rank];
            } else {
                res[i] = String.valueOf(rank+1);
            }
        }
        return res;
    }
}
