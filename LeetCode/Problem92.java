import Problem03.ListNode;

/**
 * LeetCode第92题
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 */
public class Porblem92 {
    public static void main(String[] args) {
        
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode slow = null;
        ListNode fast = head;
        while(m > 1) {
            slow = fast;
            fast = fast.next;
            --m;
            --n;
        }
        ListNode con = slow;
        ListNode tail = fast;
        while(n > 0){
            ListNode node = fast.next;
            fast.next = slow;
            slow = fast;
            fast = node;
            --n;
        }
        if(con != null) {
            con.next = slow;
        } else {
            head = slow;
        }
        tail.next = fast;
        return head;
    }
}