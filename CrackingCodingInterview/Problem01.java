public class Problem01 {
    public static void main(String[] args) {
        
    }

    /**
     * 两个for循环遍历
     * 时间复杂度O(n^2)
     * 空间复杂度O(1)
     * @return
     */
    public boolean checkDifferent(String iniString) {
        int length = iniString.length();
        for(int i = 0; i < length; ++i) {
            for(int j = i + 1; j < length; ++j) {
                if(iniString.charAt(i) == iniString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 若字符串的内容都是ASCII编码
     * 则可以定义一个256大小的数组
     * 用于存储这个字符是否存在过
     * @param iniString
     * @return
     */
    public boolean checkDifferent1(String iniString) {
        boolean state[] = new boolean[256];
        for(int i = 0; i < iniString.length(); ++i) {
            if(state[iniString.charAt(i)]) {
                return false;
            }
            state[iniString.charAt(i)] = true;
        }
        return true;
    }
}