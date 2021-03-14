package LeetCode;

public class Problem383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[26];
        for(int i = 0; i < magazine.length(); ++i) {
            res[magazine.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < ransomNote.length(); ++i) {
            int j = ransomNote.charAt(i) -'a';
            res[j] -= 1;
            if(res[j] < 0) {
                return false;
            }
        }
        return true;

    }
}
