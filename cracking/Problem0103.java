package cracking;

public class Problem0103 {
    public static void main(String[] args) {

    }

    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); ++i) {
            char a = S.charAt(i);
            if (a == ' ') {
                sb.append("%20");
            } else {
                sb.append(a);
            }
        }
        return sb.toString();
    }
}
