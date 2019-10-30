/**
 * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
 *
 * 样例
 * 输入:1->2->3->4->5->NULL
 *
 * 输出:5->4->3->2->1->NULL
 */
package offer;

public class Problem24 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode cureNode = head;
        ListNode preNode = null;
        ListNode resultNode = null;
        while (cureNode != null) {
            ListNode next = cureNode.next;
            if (next == null) {
                resultNode = cureNode;
            }
            cureNode.next = preNode;
            preNode = cureNode;
            cureNode = next;
        }
        return resultNode;
    }

}
