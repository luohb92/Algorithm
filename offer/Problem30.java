package offer;

import java.util.Stack;

public class Problem30 {
    class MinStack {
        private Stack<Integer> dataStack;
        private Stack<Integer> miniStack;
        /** initialize your data structure here. */
        public MinStack() {
            dataStack = new Stack<>();
            miniStack = new Stack<>();
        }

        public void push(int x) {
            dataStack.push(x);
            if(miniStack.isEmpty() || miniStack.peek() >= x) {
                miniStack.push(x);
            }
        }

        public void pop() {
            int value = dataStack.pop();
            if(value == miniStack.peek()) {
                miniStack.pop();
            }
        }

        public int top() {
            return dataStack.peek();
        }

        public int min() {
            return miniStack.peek();
        }
    }
}
