package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem20 {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); ++i) {
            char a = s.charAt(i);
            if(map.containsKey(a)) {
                if(stack.isEmpty() || map.get(a) != stack.peek()) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        return stack.isEmpty();
    }
}
