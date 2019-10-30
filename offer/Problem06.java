/**
 * 从尾到头打印链表
 * 输入一个链表的头结点，按照 从尾到头 的顺序返回节点的值
 * 样例
 * 输入：[2, 3, 5]
 * 返回：[5, 3, 2]
 */
package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem06 {
    public static void main(String[] args) {

    }

    public int[] printListReversingly(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list =  new ArrayList<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        int[] res = new int[list.size()];
        for (int  i = 0; i < list.size(); ++i) {
            res[i] = list.get(i);
        }
        return res;
    }
}
