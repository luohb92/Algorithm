package LeetCode;

public class Problem134 {
    /**
     *贪心算法
     * 如果总的剩余油量小于0，则不能跑一圈
     * 当前累加rest[j]的和curSum一旦小于0，起始位置至少要是j+1，
     * 因为从j开始一定不行。全局最优：找到可以跑一圈的起始位置。
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int start = 0;
        for(int i = 0; i < gas.length; ++i) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if(curSum < 0) {
                start = i +1;
                curSum = 0;
            }
        }
        if(totalSum < 0) {
            return -1;
        }
        return start;
    }


    /**
     * 模拟从0位置开始为起点，看是不是可以跑一圈
     * 计算最总剩余油量，如果最后跑到起点的时候
     * 油量大于等于0则满足条件
     */
    public int canCompleteCircuit1(int[] gas, int[] cost) {
        for(int i = 0; i < cost.length; ++i) {
            int res = gas[i] - cost[i];
            int index = (i+1) % cost.length;
            while(res > 0 && index != i) {
                res += gas[index] - cost[index];
                index = (index + 1) % cost.length;
            }
            if(res >= 0 && index == i) {
                return i;
            }
        }
        return -1;
    }
}
