package LeetCode;

public class Problem171 {
    //倒着遍历
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int res = 0;
        int m = 1;
        for(int i = chars.length -1; i >=0; --i) {
            res = res + m * (chars[i] - 'A' + 1);
            m *= 26;
        }
        return  res;
    }

    //顺着遍历
    public int titleToNumber1(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int res = 0;
        for(int i = 0; i < chars.length; ++i) {
            res = res  * 26 + (chars[i] - 'A' + 1);
        }
        return  res;
    }


}
