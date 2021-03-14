package LeetCode;

import java.util.Stack;

public class Problem155 {
    class MinStack {
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;
        /** initialize your data structure here. */
        public MinStack() {
            stackData = new Stack<Integer>();
            stackMin = new Stack<Integer>();
        }

        public void push(int x) {
            if(stackMin.isEmpty()) {
                stackMin.push(x);
            } else if(x <= stackMin.peek()) {
                stackMin.push(x);
            }
            stackData.push(x);
        }

        public void pop() {
            int value = stackData.pop();
            if(value == stackMin.peek()) {
                stackMin.pop();
            }

        }

        public int top() {
            return stackData.peek();
        }

        public int getMin() {
            return stackMin.peek();
        }
    }
}
