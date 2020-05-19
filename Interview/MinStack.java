package Interview;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack() {
        stackData = new Stack<Integer>();
        stackMin = new Stack<>();
    }

    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.stackMin.peek()) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int num = this.stackData.pop();
        if (num == this.getMini()) {
            this.stackMin.pop();
        }
        return num;
    }

    public int getMini() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        return this.stackMin.peek();
    }
}
