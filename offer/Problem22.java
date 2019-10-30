/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * 注意：
 *
 * k >= 0;
 * 如果k大于链表长度，则返回 NULL;
 * 样例
 * 输入：链表：1->2->3->4->5 ，k=2
 *
 * 输出：4
 */
package offer;

public class Problem22 {
    public static void main(String[] args) {

    }

    /**
     * 快慢指针
     * 两个指针slow和fast，
     * @param pListHead
     * @param k
     * @return
     */
    public ListNode findKthToTail(ListNode pListHead, int k) {
        if (pListHead == null) {
            return null;
        }
        ListNode slow = pListHead;
        ListNode fast = pListHead;
        while (k != 0) {
            --k;
            fast = fast.next;
            if (fast == null && k != 0) {
                return null;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
}
