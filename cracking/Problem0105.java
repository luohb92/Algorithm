package cracking;

public class Problem0105 {
    public boolean oneEditAway(String first, String second) {
        int f = first.length();
        int s = second.length();
        if(Math.abs(f-s) > 1) {
            return false;
        }
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < f && j < s) {
            if(first.charAt(i++) == second.charAt(j++)) {
                continue;
            }
            ++count;
            if(count > 1) {
                return false;
            }
            if(f != s) {
                if(f > s) {
                    --j;
                } else {
                    --i;
                }
            }
        }
        return true;
    }
}
