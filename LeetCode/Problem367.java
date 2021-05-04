package LeetCode;

public class Problem367 {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while(left <= right) {
            long mid = left + ((right - left) >> 1);
            long sum = mid * mid;
            if(sum > num) {
                right = mid -1;
            } else if(sum < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
