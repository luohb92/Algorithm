package LeetCode;

public class Problem28 {
    public int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();
        if(hLength < nLength) {
            return -1;
        } else if(nLength == 0){
            return  0;
        }
        for(int i = 0; i <= hLength - nLength; ++i) {
            if(haystack.substring(i, i+nLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
