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
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while(node != null) {
            stack.push(node.val);
            node = node.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()) {
            res[i] = stack.pop();
            ++i;
        }
        return res;
    }
}
