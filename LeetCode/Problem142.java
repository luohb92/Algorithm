package LeetCode;

public class Problem142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode fast = helper(head);
        if(fast == null) {
            return null;
        }
        ListNode slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    private ListNode helper(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return fast;
            }
        }
        return null;
    }

}
