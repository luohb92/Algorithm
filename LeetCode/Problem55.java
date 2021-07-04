package LeetCode;

public class Problem55 {
    /**
     *贪心算法
     * 每次取最大跳跃步数（取最大覆盖范围），整体最优解：最后得到整体最大覆盖范围，看是否能到终点
     */
    public boolean canJump(int[] nums) {
        int cover = nums[0];
        for(int i = 0; i <= cover; ++i) {
            cover = Math.max(nums[i] + i, cover);
            if(cover >= nums.length -1) {
                return true;
            }
        }
        return false;
    }
}
