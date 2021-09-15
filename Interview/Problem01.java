package Interview;

import java.util.Scanner;
import java.util.Stack;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinStack minStack = new MinStack();
        int N = scanner.nextInt();
        scanner.nextLine();
        System.out.println(N);
        String[] line;
        for(int i = 0; i < N; ++i) {
            line = scanner.nextLine().split(" ");
            System.out.println(line[0]);
            System.out.println(line[1]);
            if (line[0].equals("getMin")) {
                minStack.getMin();
            } else if (line[0].equals("push")) {
                minStack.push(Integer.valueOf(line[1]));
            } else if (line[0].equals("pop")) {
                minStack.pop();
            }

        }
    }

    static class MinStack{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;
        MinStack(){
            stackData = new Stack<>();
            stackMin = new Stack<>();
        }

        public void push(int number) {
            stackData.push(number);
            if(stackMin.isEmpty()) {
                stackMin.push(number);
            } else if (number <= stackMin.peek()){
                stackMin.push(number);
            }
        }
        public int pop(){
            if (stackData.isEmpty()) {
                throw new RuntimeException("stack is empty");
            }
            int value = stackData.pop();
            if (value == stackMin.peek()) {
                stackMin.pop();
            }
            return value;

        }

        public int getMin(){
            if (stackMin.isEmpty()) {
                throw new RuntimeException("stack is empty");
            }
            return stackMin.peek();
        }
    }
}
