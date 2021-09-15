package cracking;

public class Problem0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        while(k > 0) {
            fast = fast.next;
            --k;
        }
        while(fast != null) {
            slow = slow.next;
            fast =fast.next;
        }
        return slow.val;
    }

}
