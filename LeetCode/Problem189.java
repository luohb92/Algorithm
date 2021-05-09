package LeetCode;

public class Problem189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        for (int i = 0; i < k; ++i) {
            int temp = nums[length-1];
            for(int j = length -1; i > 0; --i) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }

    public void rotate1(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] numsCopy = new int[n];
        for (int i = 0; i < n; i++) {
            numsCopy[i] = nums[i];
        }

        //末尾的 k 个数复制过来
        for (int i = 0; i < k; i++) {
            nums[i] = numsCopy[n - k + i];
        }

        //剩下的数复制过来
        for (int i = k; i < n; i++) {
            nums[i] = numsCopy[i - k];
        }
    }
}
