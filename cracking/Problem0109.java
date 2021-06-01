package cracking;

public class Problem0109 {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        String s = s1 + s1;
        return s.contains(s2);
    }
}
