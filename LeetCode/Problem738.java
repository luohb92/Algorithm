package LeetCode;

public class Problem738 {

    /**
     * 贪心算法
     * 从后往前遍历
     * 遇到strNum[i - 1] > strNum[i]的情况，让strNum[i - 1]--，
     * 然后strNum[i]给为9，可以保证这两位变成最大单调递增整数
     */
    public int monotoneIncreasingDigits(int n) {
        String[] strings = (n + "").split("");
        int start = strings.length;
        for (int i = strings.length -1; i > 0; --i) {
            if(Integer.parseInt(strings[i-1]) > Integer.parseInt(strings[i])) {
                strings[i-1] = (Integer.parseInt(strings[i-1]) -1 ) + "";
                start = i;
            }
        }
        for (int i = start; i < strings.length; ++i) {
            strings[i] = "9";
        }
        return Integer.parseInt(String.join("", strings));
    }


    /**
     * 暴力解法
     * 会超时
     */
    public int monotoneIncreasingDigits1(int n) {
        for(int i = n; i > 0; --i) {
            if (checkNum(i)) {
                return i;
            }
        }
        return 0;
    }

    private boolean checkNum(int num) {
        int max = 10;
        while(num > 0) {
            int t = num % 10;
            if(max >= t) {
                max = t;
            } else {
                return false;
            }
            num = num / 10;
        }
        return true;
    }


}
