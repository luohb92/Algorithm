package offer;

public class Problem19 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplication(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode temp = pre;
        while (fast != null) {
            if (slow.val == fast.val) {
                fast = fast.next;
            } else {

            }
        }
        return pre.next;

    }

}