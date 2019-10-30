/**
 * LeetCode第206题
 * 反转一个单链表。
 */
package LeetCode;
public class Problem206 {
    public static void main(String[] args) {
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode slow = null;
        ListNode fast = head;
        while(fast != null) {
            ListNode node = fast.next;
            fast.next = slow;
            slow = fast;
            fast = node;
        }
        return slow;
    }
}