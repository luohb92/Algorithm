package Offer2;

public class Problem025 {
    /**
     * 将两个链表反转
     * 反转后遍历相加，取余数
     * 最后将结果反转就是最终的答案
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode m = revser(l1);
        ListNode k = revser(l2);
        int carry = 0;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while(m != null || k != null) {
            int sum = (m == null ? 0: m.val) + (k == null ? 0 : k.val) + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            cur.next = node;
            cur = cur.next;
            m = m == null ? null : m.next;
            k = k == null ? null : k.next;
        }
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }

        return revser(pre.next);


    }

    private ListNode revser(ListNode head) {
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
