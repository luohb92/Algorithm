package LeetCode;

public class Problem445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode m = reverse(l1);
        ListNode k = reverse(l2);
        int carry = 0;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while(m != null || k != null) {
            int sum = (m == null ? 0 : m.val) + (k == null ? 0 : k.val) + carry;
            carry = sum / 10;
            sum = sum  % 10;
            ListNode next = new ListNode(sum);
            cur.next = next;
            cur = cur.next;
            m = m == null ? null: m.next;
            k = k == null ? null: k.next;
        }
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }
        return reverse(pre.next);

    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
