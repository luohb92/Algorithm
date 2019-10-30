/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换
 * 示例:
 * 给定 1->2->3->4, 你应该返回 2->1->4->3
 */
package LeetCode;
public class Problem24 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        swapPairs(head);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode slow = temp.next;
            ListNode fast = temp.next.next;
            temp.next = fast;
            slow.next = fast.next;
            fast.next = slow;
            temp = slow;
        }
        return pre.next;
    }
}