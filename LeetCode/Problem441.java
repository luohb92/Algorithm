package LeetCode;

public class Problem441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        for (int i = 1; i <= n; ++i) {
            if (((i+1) * (i +2)) / 2 > n ) {
                return i;
            }
        }
        return -1;
    }
}
