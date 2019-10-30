/**
 * 比较版本号
 * 比较两个版本号 version1 和 version2。
 * 如果 version1 > version2 返回 1，
 * 如果 version1 < version2 返回 -1，
 * 除此之外返回 0。
 */
package LeetCode;

public class Problem165 {
    public static void main(String[] args) {
        String version1 = "1";
        String version2 = "1.1";
        String test = version1.substring(0,1);
        System.out.println(test);
//        System.out.println(compareVersion(version1, version2));
    }

    public static int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        while (i < version1.length() || j < version2.length()) {
            int m = i, n = j;
            while (m < version1.length() && version1.charAt(m) !='.') {
                ++m;
            }
            while (n < version2.length() && version2.charAt(n) != '.') {
                ++n;
            }
            int a = i == m ? 0 :  Integer.valueOf(version1.substring(i, m));
            int b = j == n ? 0 : Integer.valueOf(version2.substring(j, n));
            if (a > b) {
                return 1;
            }
            if (a < b) {
                return -1;
            }
            i = m +1;
            j = n +1;
        }
        return 0;
    }
}
