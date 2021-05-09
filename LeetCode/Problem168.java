package LeetCode;

public class Problem168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            int c = columnNumber % 26;
            if (c == 0) {
                c = 26;
                columnNumber -= 1;
            }
            char a = (char) ('A' + c -1);
            sb.insert(0, a);
            columnNumber /= 26;
        }
        return sb.toString();
    }
}
