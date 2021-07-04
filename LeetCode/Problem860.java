package LeetCode;

public class Problem860 {
    /**
     * 情况一：账单是5，直接收下。
     * 情况二：账单是10，消耗一个5，增加一个10
     * 情况三：账单是20，优先消耗一个10和一个5，如果不够，再消耗三个5
     */
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if(bill == 5) {
                ++five;
            } else if (bill == 10) {
                if(five <=0) {
                    return false;
                }
                --five;
                ++ten;
            } else {
                if(ten > 0 && five > 0) {
                    --ten;
                    --five;
                } else if(five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}
