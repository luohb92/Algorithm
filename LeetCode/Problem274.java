package LeetCode;

import java.util.Arrays;

public class Problem274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 1;
        for (int i = citations.length -1; i >= 0; --i) {
            if(res  > citations[i]) {
                break;
            }
            ++res;
        }
        return res -1;
    }
}
