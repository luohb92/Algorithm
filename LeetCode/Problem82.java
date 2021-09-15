/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字
 */
package LeetCode;

public class Problem82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode slow = pre;
        ListNode fast = pre.next;
        while (fast != null) {
            if (fast.next == null || fast.val != fast.next.val) {
                if (slow.next == fast) {
                    slow = fast;
                } else {
                    slow.next = fast.next;
                }
            }
            fast = fast.next;
        }
        return pre.next;
    }
}
