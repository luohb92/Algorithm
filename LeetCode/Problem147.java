package LeetCode;

public class Problem147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode pre = new ListNode(-1);
        while(head != null) {
            ListNode temp = pre;
            ListNode headNext = head.next;
            head.next = null;
            while(temp.next != null) {
                if(temp.next.val > head.val) {
                    head.next = temp.next;
                    temp.next = head;
                    break;
                }
                temp = temp.next;
            }
            if (temp.next == null) {
                temp.next = head;
            }
            head = headNext;
        }
        return pre.next;
    }
}
