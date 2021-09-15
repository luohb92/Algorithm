package Offer2;

import java.util.Stack;

public class Problem037 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int as : asteroids) {
            while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -as) {
                stack.pop();
            }
            if(!stack.isEmpty() && as < 0 && stack.peek() == -as) {
                stack.pop();
            } else if(stack.isEmpty() || as > 0) {
                stack.push(as);
            }
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; ++i) {
            res[i] = stack.get(i);
        }
        return res;
    }
}
