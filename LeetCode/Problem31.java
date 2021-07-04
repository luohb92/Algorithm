package LeetCode;

public class Problem31 {
    /***
     * 假设样例为 [1,3,5,4,1]：
     *
     * 从后往前找，找到第一个下降的位置，记为 k。注意k 以后的位置是降序的。 在样例中就是找到 3
     *
     * 从 k 往后找，找到最小的比 k 要大的数。 找到 4
     *
     * 将两者交换。注意此时 k 以后的位置仍然是降序的。
     *
     * 直接将 k 以后的部分翻转（变为升序）
     */
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = n -1;
        while(k -1 >=0 && nums[k-1] >= nums[k]) {
            --k;
        }
        if(k == 0) {
            reverse(nums, 0, n -1);
        } else {
            int u = k;
            while(u + 1 < n && nums[u +1] > nums[k-1]) {
                ++u;
            }
            swap(nums, k-1, u);
            reverse(nums, k, n-1);
        }
    }
    private void reverse(int[] nums, int a, int b) {
        while(a < b) {
            swap(nums, a, b);
            ++a;
            --b;
        }
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
