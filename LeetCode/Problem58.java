package LeetCode;

public class Problem58 {

    /**
     * 从后往前遍历
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int end = s.length()-1;
        while(end >= 0 && s.charAt(end) == ' ') {
            --end;
        }
        if(end < 0) {
            return 0;
        }
        int start = end;
        while(start >=0 && s.charAt(start) != ' ') {
            --start;
        }
        return end - start;
    }
}
