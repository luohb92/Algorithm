/**
 * LeetCode第160题
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
package LeetCode;

public class Problem160 {


    //先对两条链表扫描一遍，取得两者长度，
    //然后让长的链表先走「两者的长度差值」，
    //然后再同时走，遇到第一个节点即是答案。

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        int c1 = 0;
        int c2 = 0;
        while(p != null) {
            ++c1;
            p = p.next;
        }
        while(q != null) {
            ++c2;
            q = q.next;
        }
        int t = Math.abs(c1 - c2);
        while(t > 0) {
            if(c1 > c2) {
                headA = headA.next;
            } else {
                headB = headB.next;
            }
            --t;
        }
        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
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