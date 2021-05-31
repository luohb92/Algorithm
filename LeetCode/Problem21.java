package LeetCode;
public class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode h = pre;
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                h.next = l2;
                h = l2;
                l2 = l2.next;
            } else {
                h.next = l1;
                h = l1;
                l1= l1.next;
            }
        }
        if(l1 != null) {
            h.next = l1;
        }
        if(l2 != null) {
            h.next = l2;
        }
        return pre.next;
    }
}