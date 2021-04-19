package LeetCode;

import java.util.Stack;

public class Problem71 {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length; ++i) {
            if(s[i].equals(".")  || s[i].length() == 0) {
                continue;
            } else if (s[i].equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s[i]);
            }
        }
        String res = stack.isEmpty() ? "/" : "";
        while(!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }
        return res;
    }
}
