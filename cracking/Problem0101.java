package cracking;

import java.util.HashSet;
import java.util.Set;

public class Problem0101 {
    public static void main(String[] args) {
        String astr = "luohaibo";
        System.out.println(isUnique(astr));
    }

    /**
     * 遍历字符串，然后使用set保存遍历的值
     * 当当前值在set中存在的时候，则返回false
     * 不存在就将当前值放到set中
     * @param astr
     * @return
     */
    public static boolean isUnique(String astr) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); ++i) {
            if (set.contains(astr.charAt(i))) {
                return false;
            } else {
                set.add(astr.charAt(i));
            }
        }
        return true;

    }
}
