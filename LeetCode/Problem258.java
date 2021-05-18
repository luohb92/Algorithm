package LeetCode;

public class Problem258 {
    public int addDigits(int num) {
        if(num < 10) {
            return num;
        }
        while(num >= 10) {
            num = help(num);
        }
        return num;
    }
    private int help(int num) {
        int res = 0;
        int m = 0;
        while(num != 0) {
            m = num % 10;
            num /= 10;
            res += m;
        }
        return res;
    }

    public int addDigits1(int num) {
        if(num == 0) {
            return 0;
        }
        if(num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public int addDigits2(int num) {
        return (num -1 ) % 9 + 1;
    }
}
