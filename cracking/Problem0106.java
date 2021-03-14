package cracking;

public class Problem0106 {
    public String compressString(String S) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0, j = 1; i < S.length() && j < S.length();) {
            if(S.charAt(j) == S.charAt(i)) {
                ++j;
            } else {
                builder.append(S.charAt(i)).append(String.valueOf(j -i));
                ++j;
                i = j;
            }
        }
        if (builder.length() > S.length()) {
            return S;
        } else {
            return builder.toString();
        }
    }
}
