/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5
 */
package LeetCode;
public class Problem19 {
    /**
     * 快慢指针法
     * 先设置一个头pre, pre的next等于head
     * 然后设置两个指针slow和fast
     * 让fast往前移动n位
     * 同时让fast和slow通频率往前走，直到fast到达尾部(fast.next == null)
     * 这个时候slow到达的位置要删除节点的前一位
     * 然后删除slow的下一位就是slow.next = slow.next.next
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode slow = pre;
        ListNode fast = head;
        while(n != 0) {
            fast = fast.next;
            --n;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return pre.next;
    }
}