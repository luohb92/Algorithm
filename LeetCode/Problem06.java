package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem06 {
    public String convert(String s, int numRows) {
        if(s == null || s.length() < 1 || numRows < 2) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for(int i= 0; i < numRows; ++i) {
            list.add(new StringBuilder());
        }
        int index = 0;
        int flag = 1;
        for(char c: s.toCharArray()) {
            list.get(index).append(c);
            index += flag;
            if(index == 0 || index == numRows -1) {
                flag = -flag;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < list.size(); ++i) {
            res.append(list.get(i));
        }
        return res.toString();
    }
}
