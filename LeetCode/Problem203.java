/**
 203. 移除链表元素
 删除链表中等于给定值 val 的所有节点。
 示例:

 输入: 1->2->6->3->4->5->6, val = 6
 输出: 1->2->3->4->5
 */
package LeetCode;
public class Problem203 {
    public static void main(String[] args) {
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode slow = pre;
        ListNode fast = pre.next;
        while(fast != null) {
            if(fast.val == val) {
                slow.next = fast.next;
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return pre.next;
    }
}