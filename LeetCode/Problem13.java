/**
 * 罗马数字转换转整数
 */
package LeetCode;

public class Problem13 {
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            switch (char1) {
                case 'I':
                    if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                        result = result - 1;
                    } else {
                        result = result + 1;
                    }
                    break;
                case 'V':
                    result = result + 5;
                    break;
                case 'X':
                    if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                        result = result - 10;
                    } else {
                        result = result + 10;
                    }
                    break;
                case 'L':
                    result = result + 50;
                    break;
                case 'C':
                    if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                        result = result - 100;
                    } else {
                        result = result + 100;
                    }
                    break;
                case 'D':
                    result = result + 500;
                    break;
                case 'M':
                    result = result + 1000;
                    break;
            }
        }
        return result;
    }
}
