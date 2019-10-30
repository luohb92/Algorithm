package LeetCode;

public class Problem38 {
    public static void main(String[] args) {
        System.out.println(Integer.toString(-1));
    }

    public String countAndSay(int n) {
        String str = "1";
        for (int i = 0; i < n -1; ++i) {
            String s = "";
            for (int j = 0; j < str.length(); ++j) {
                int k = j;
                while (k < str.length() && str.charAt(j)== str.charAt(k)) {
                    ++k;
                }
                s = s + Integer.toString(k-j) + str.charAt(j);
                j = k-1;
            }
            str = s;
        }
        return str;
    }
}
