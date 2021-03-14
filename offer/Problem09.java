package offer;

import java.util.Stack;

public class Problem09 {
    class CQueue {
        private Stack<Integer> dataStack;
        private Stack<Integer> deleteStack;
        public CQueue() {
            dataStack = new Stack<>();
            deleteStack = new Stack<>();
        }

        public void appendTail(int value) {
            dataStack.push(value);

        }

        public int deleteHead() {
            if(deleteStack.isEmpty()) {
                while(!dataStack.isEmpty()) {
                    deleteStack.push(dataStack.pop());
                }
            }
            if(deleteStack.isEmpty()) {
                return -1;
            } else {
                return deleteStack.pop();
            }
        }
    }
}
