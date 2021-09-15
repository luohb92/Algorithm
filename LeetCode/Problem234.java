/**
 * 请判断一个链表是否为回文链表
 * 输入: 1->2  输出: false
 * 输入: 1->2->2->1 输出: true
 */
package LeetCode;
public class Problem234 {
    /**
     * 快慢指针，
     * 先使用快慢指针，查到ListNode的中间
     * slow走一步，fast走两步，当fast == null 或者fat.next == null 则slow在中间
     * 然后反转slow前面的链表
     * 如何链表长度为奇数，则slow往下走一步，再去比较
     * 最后前面一段和后面一段聊表
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pre = null;
        ListNode next = null;
        while(head != slow) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        if(fast != null) {
            slow = slow.next;
        }
        while(pre != null) {
            if(pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;

    }

}