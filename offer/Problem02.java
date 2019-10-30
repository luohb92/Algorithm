package offer;
public class Problem02 {
    public static void main(String[] args) {
        
    }

    public String replaceSpace(StringBuffer str) {
        int length = str.length();
        int spaceSize = 0;
        for(int i = 0 ; i < length; ++i) {
            if(str.charAt(i) == ' ') {
                ++spaceSize;
            }
        }
        int[] a = new int[length + 2*spaceSize];
        int j = -1;
        for(int i = 0 ; i < length; ++i) {
            if(str.charAt(i) == ' ') {
                a[j+ 1] = '%';
                a[j+2] = '2';
                a[j+3] = '0';
                j = j+3;
            } else {
                ++j;
                a[j] = str.charAt(i);
            }
        }
        return new String(a, 0, a.length);

    }
}