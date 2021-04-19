/**
 * 给定一个链表和一个特定值 x，
 * 对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前
 * 你应当保留两个分区中每个节点的初始相对位置。
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 */
package LeetCode;

public class Problem86 {

    public ListNode partition(ListNode head, int x) {
            ListNode minHead = new ListNode(0);
            ListNode maxHead = new ListNode(0);
            ListNode min = minHead;
            ListNode max = maxHead;
            while(head != null) {
                if(head.val < x) {
                    min.next = head;
                    min = min.next;
                } else {
                    max.next = head;
                    max = max.next;
                }
                head = head.next;
            }
            max.next = null;
            min.next = maxHead.next;
            return minHead.next;
        }
}
