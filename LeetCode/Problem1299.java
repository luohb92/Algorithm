package LeetCode;

public class Problem1299 {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int res[] = new int[arr.length];
        res[length - 1] = -1;
        for(int i = length - 2; i >= 0; --i) {
            res[i] = Math.max(res[i+1], arr[i+1]);
        }
        return res;
    }
}
