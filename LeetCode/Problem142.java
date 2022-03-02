package LeetCode;

public class Problem142 {
    /**
     * 先找到相遇的节点
     * 然后一步一步遍历
     * 遍历相等时候就是环的入口
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = helper(head);
        if(fast == null) {
            return null;
        }
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
                return slow;
            }
        }
        return null;
    }

}
