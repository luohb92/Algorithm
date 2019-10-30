package LeetCode;

public class Problem374 {
    public static void main(String[] args) {

    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low +(high - low) / 2;
            int res = guess(mid);
            if (res == 0) {
                return  mid;
            } else if (res > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public int guess(int n) {
        return 0;
    }
}
