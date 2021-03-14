package LeetCode;

public class Problem680 {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                ++left;
                --right;
            } else {
                return helper(s, left + 1, right) || helper(s,  left, right-1);
            }
        }
        return true;
    }

    private boolean helper(String s, int left, int right) {
        for(int i = left, j = right; i < j; ++i, --j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
