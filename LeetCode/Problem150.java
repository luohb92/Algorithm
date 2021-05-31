package LeetCode;

import java.util.Stack;

public class Problem150 {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String token: tokens) {
            if(isOperation(token)) {
                String a = stack.pop();
                String b = stack.pop();
                int result = helper(Integer.parseInt(b), Integer.parseInt(a),token);
                stack.push(result+"");
            } else {
                stack.push(token);
            }
        }
        int res = Integer.parseInt(stack.pop());
        return res;
    }

    private int helper(int a, int b, String op) {
        switch (op){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;

        }
        return 0;
    }

    private boolean isOperation(String t) {
        return t.equals("+") || t.equals("-")
                || t.equals("*") || t.equals("/");
    }
}
