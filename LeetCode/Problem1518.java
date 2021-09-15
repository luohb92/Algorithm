package LeetCode;

public class Problem1518 {
    /**
     * 贪心算法
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = 0;
        int res = 0;
        while(numBottles > 0) {
            res += numBottles;
            int count = numBottles + empty;
            numBottles = count / numExchange;
            empty = count % numExchange;
        }
        return res;
    }
}
