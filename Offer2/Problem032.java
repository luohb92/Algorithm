package Offer2;

public class Problem032 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() || s.equals(t)) {
            return false;
        }
        int[] res = new int[26];
        for(char a: s.toCharArray()) {
            res[a - 'a'] ++;
        }
        for(char a : t.toCharArray()) {
            if(res[a - 'a'] == 0) {
                return false;
            }
            res[a - 'a']--;
        }
        return true;

    }
}
