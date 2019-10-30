package LeetCode;

public class Problem125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);

    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; ++i) {
            char a = s.charAt(i);
            if ('a' <= a && a <= 'z') {
                buffer.append(a);
            } else if ('A' <= a && a <= 'Z') {
                char b =(char) (a + 32);
                buffer.append(b);
            } else if ('0' <= a && a <= '9') {
                buffer.append(a);
            }
        }
        int i = 0;
        int j = buffer.length()-1;
        while (i <= j) {
            if (buffer.charAt(i) != buffer.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
