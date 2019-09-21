/**
 * LeetCode第92题
 * 删除链表中等于给定值 val 的所有节点
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class Problem203 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next= new ListNode(6);
        ListNode result = removeElements(head, 6);
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(0);
        header.next = head;
        ListNode cur = header;
        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        } 
        return header.next;
    }

    public static class ListNode{
        public int val;
        public ListNode next = null;public ListNode(int val) {
            this.val = val;
        }
    }
}