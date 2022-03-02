package Offer2;

public class Problem006 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        int[] res = new int[2];
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum > target) {
                --right;
            } else if(sum < target) {
                ++left;
            } else {
                res[0] = left;
                res[1] = right;
                return res;
            }
        }
        return res;
    }
}
