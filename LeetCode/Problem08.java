package LeetCode;

public class Problem08 {
    public int myAtoi(String s) {
        int length = s.length();
        char[] charArray = s.toCharArray();
        int index = 0;
        while(index < length && charArray[index] == ' ') {
            ++index;
        }
        if(index == length) {
            return 0;
        }
        int sign = 1;
        if(charArray[index] == '+') {
            ++index;
        } else if(charArray[index] == '-') {
            ++index;
            sign = -1;
        }
        int res = 0;
        while(index < length) {
            char curChar = charArray[index];
            if(curChar > '9' || curChar < '0') {
                break;
            }
            if(res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && curChar - '0' > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && curChar - '0' > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (curChar - '0');
            ++index;
        }
        return res;
    }
}
