package LeetCode;

public class Problem172 {
    public static void main(String[] args) {

    }

    public int trailingZeroes(int n) {
        int sum = 1;
        int numZero = 0;
        while (n != 1) {
            sum = sum * n;
            --n;
        }
        while (sum != 0) {
            int m = sum % 10;
            if (m == 0) {
                ++numZero;
            }
            sum = sum / 10;
        }
        return numZero;
    }
}
