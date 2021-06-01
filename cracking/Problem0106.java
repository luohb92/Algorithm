package cracking;

public class Problem0106 {
    public String compressString(String S) {
        int N = S.length();
        int i = 0;
        StringBuilder res = new StringBuilder();
        while(i < N) {
            int j = i;
            while(j < N && S.charAt(i) == S.charAt(j)) {
                ++j;
            }
            res.append(S.charAt(i));
            res.append(j -i);
            i = j;
        }
        if (res.length() < N) {
            return res.toString();
        } else {
            return S;
        }

    }
}
