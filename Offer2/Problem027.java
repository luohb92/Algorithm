package Offer2;

public class Problem027 {
    /**
     * 先使用快慢指针 遍历到链表中间
     * 将链表中间前面的反转
     * 要注意在奇数长度的情况下，slow的遍历到的位置正好是中间的那个值
     * 需要往下再走一步
     * 然后遍历后面这段的链表和前面反转后的链表，比较值的大小
     */
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode pre = null;
        while(head != slow) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        //奇数情况下
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
