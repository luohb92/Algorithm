package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem763 {
    public List<Integer> partitionLabels(String s) {
        int[] hash = new int[27];
        for(int i = 0; i < s.length(); ++i) {
            hash[s.charAt(i) - 'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = 0;
        for(int i = 0; i < s.length(); ++i) {
            right = Math.max(right, hash[s.charAt(i) - 'a']);
            if(i == right) {
                res.add(right - left + 1);
                left = i + 1;
            }
        }
        return res;
    }

}
