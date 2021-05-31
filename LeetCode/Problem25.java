package LeetCode;

public class Problem25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode cur = pre;
        while(cur != null) {
            reverse(cur, k);
            int m = k;
            while(m > 0 && cur != null) {
                cur = cur.next;
                --m;
            }
        }
        return pre.next;
    }
    private void reverse(ListNode root, int k){
        int m = k;
        ListNode cur = root;
        while(m > 0 && cur != null) {
            cur = cur.next;
            --m;
        }
        if(cur == null) {
            return ;
        }
        ListNode a = root.next;
        ListNode b = a.next;
        while(k > 1) {
            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;
            --k;
        }
        root.next.next = b;
        root.next = a;
    }
}
