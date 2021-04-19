package LeetCode;

import java.util.Stack;

public class Problem1047 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < S.length();++i) {
            char a = S.charAt(i);
            if(stack.isEmpty()) {
                stack.add(a);
            } else {
                if(stack.peek() == a) {
                    stack.pop();
                } else {
                    stack.add(a);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
