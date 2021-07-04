package LeetCode;

public class Problem654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length);
    }

    private TreeNode helper(int[] nums, int leftIndex, int rightIndex) {
        if(rightIndex - leftIndex < 1) {
            return null;
        }
        if(rightIndex - leftIndex == 1) {
            return new TreeNode(nums[leftIndex]);
        }
        int maxIndex = leftIndex;
        int maxValue = nums[maxIndex];
        for(int i = leftIndex +1; i < rightIndex; ++i) {
            if(nums[i] > maxValue) {
                maxIndex = i;
                maxValue = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxValue);
        root.left = helper(nums, leftIndex, maxIndex);
        root.right = helper(nums, maxIndex+1, rightIndex);
        return root;
    }
}
