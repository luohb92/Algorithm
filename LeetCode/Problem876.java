/**
 * LeetCode第876题
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点
 */
package LeetCode;
public class Problem876 {
    /**
     * 先获取链表的长度，求的长度的一半
     * 
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int length = 0;
        while(node != null) {
            ++length;
            node = node.next;
        }
        int midle = length / 2 + 1;
        while(head != null && midle > 1) {
            --midle;
            head = head.next;
        }
        return head;
    }

    /**
     *用快慢指针
     *当用慢指针 slow 遍历列表时，让另一个指针 fast 的速度是它的两倍
     *当 fast 到达列表的末尾时，slow 必然位于中间
     * @param head
     * @return
     */
    public ListNode middleNode1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}