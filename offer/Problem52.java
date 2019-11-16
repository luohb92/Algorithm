/**
 * 两个链表的第一个公共结点
 * 输入两个链表，找出它们的第一个公共结点。
 *
 * 当不存在公共节点时，返回空节点。
 */
package offer;

public class Problem52 {
    public static void main(String[] args) {

    }

    public ListNode findFirstCommonNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            if (p != null) {
                p = p.next;
            } else {
                p = headB;
            }
            if (q != null) {
                q = q.next;
            } else {
                q = headA;
            }
        }
        return p;
    }

}
