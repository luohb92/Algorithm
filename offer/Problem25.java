/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。
 *
 * 样例
 * 输入：1->3->5 , 2->4->5
 *
 * 输出：1->2->3->4->5->5
 */
package offer;
public class Problem25 {
    public static void main(String[] args) {
        
    }

    /**
     * 
     * @param l1
     * @param l2
     * @return
     */
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode marge = null;
        if (l1.val < l2.val) {
            marge = l1;
            marge.next = merge(l1.next, l2);
        } else {
            marge = l2;
            marge.next = merge(l1, l2.next);
        }
        return marge;
    }
}