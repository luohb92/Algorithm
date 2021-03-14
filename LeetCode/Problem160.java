/**
 * LeetCode第160题
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
package LeetCode;
import java.util.HashSet;
import java.util.Set;

public class Problem160 {
    public static void main(String[] args) {
        
    }
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while(p != q) {
            if(p != null) {
                p = p.next;
            } else {
                p = headB;
            }
            if(q != null) {
                q = q.next;
            } else {
                q = headA;
            }
        }
        return p;
    }
}