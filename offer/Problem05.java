/**
 * 替换空格
 * 请实现一个函数，把字符串中的每个空格替换成"%20"
 * 你可以假定输入字符串的长度最大是1000。
 * 注意输出字符串的长度可能大于1000
 */
package offer;

public class Problem05 {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            char a = s.charAt(i);
            if(a == ' ') {
                res.append("%20");
            } else {
                res.append(a);
            }
        }
        return res.toString();
    }
}
