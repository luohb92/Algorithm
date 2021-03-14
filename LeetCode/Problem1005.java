package LeetCode;

import java.util.Arrays;

public class Problem1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        for(; i < A.length; ++i) {
            if(A[i] < 0 && K > 0) {
                A[i] = -A[i];
                --K;
            }
        }
        Arrays.sort(A);
        while(K > 0) {
            A[0] = -A[0];
            --K;
        }
        int res = 0;
        for(int n : A) {
            res += n;
        }
        return res;
    }
}
