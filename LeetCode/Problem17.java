package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem17 {
    List<String> res = new ArrayList<>();
    Map<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return res;
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtracking(digits, 0, new StringBuffer());
        return res;
    }

    private void backtracking(String digits, int index, StringBuffer combin){
        if(index == digits.length()) {
            res.add(combin.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i = 0; i < letters.length(); ++i) {
            combin.append(letters.charAt(i));
            backtracking(digits, index+1, combin);
            combin.deleteCharAt(index);
        }
    }
}
