/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 */
package LeetCode;

public class Problem61 {
    public static void main(String[] args) {

    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }
        int n = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            ++n;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode pre = head;
        k = k % n;
        while ( k != 0) {
            slow.next = fast.next;
            fast.next = pre;
            pre = fast;
            slow = pre;
            fast = slow.next;
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            --k;

        }
        return pre;
    }
}
