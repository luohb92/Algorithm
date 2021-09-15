package LeetCode;
public class Problem141 {
    
    /**
     * 双指针
     * slow每次走一步，fast走两步
     * 如果有环最终它们会相遇 slow == fast
     */
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}