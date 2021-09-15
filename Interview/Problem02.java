package Interview;

import java.util.Scanner;
import java.util.Stack;

/**
 * 用两个栈实现队列，支持队列的基本操作。
 * 用一个栈存在add的数据，一个栈存放remove的数据
 * 要保证remove的那个栈
 */
public class Problem02 {
    static Stack<Integer> stackAdd = new Stack<>();
    static Stack<Integer> stackRemove = new Stack<>();

    public static void add(int a) {
        stackAdd.push(a);
        addToRemove();
    }

    public static void poll(){
        if (stackAdd.isEmpty() && stackRemove.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        addToRemove();
        stackRemove.pop();
    }

    public static int peek(){
        if (stackAdd.isEmpty() && stackRemove.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        addToRemove();
        return stackRemove.peek();
    }

    public static void addToRemove(){
        if (stackRemove.isEmpty()) {
            while(!stackAdd.isEmpty()) {
                stackRemove.push(stackAdd.pop());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i <= N; ++i) {
            String str = scanner.nextLine();
            String[] splits = str.split(" ");
            if("add".equals(splits[0])) {
                add(Integer.valueOf(splits[1]));
            } else if ("poll".equals(splits[0])) {
                poll();
            } else {
                System.out.println(peek());
            }
        }
    }
}
