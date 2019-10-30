/**
 * 替换空格
 * 请实现一个函数，把字符串中的每个空格替换成"%20"
 * 你可以假定输入字符串的长度最大是1000。
 * 注意输出字符串的长度可能大于1000
 */
package offer;

public class Problem05 {
    public static void main(String[] args) {

    }

    public String replaceSpaces(StringBuffer str) {
        int length = str.length();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < length; ++i) {
            if (str.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
