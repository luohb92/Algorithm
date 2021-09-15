package Offer2;

public class Problem002 {
    /**
     * 从字符串尾部往前遍历
     * 得到两个整数 m 和k
     */
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() -1;
        int j = b.length() -1;
        int tag = 0;
        for(; i >= 0 || j >= 0; --i, --j) {
            int m = i >=0 ? a.charAt(i) - '0' : 0;
            int k = j >=0 ? b.charAt(j) - '0' : 0;
            int sum = m + k + tag;
            res.append(sum % 2);
            tag = sum / 2;
        }
        if(tag == 1) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
