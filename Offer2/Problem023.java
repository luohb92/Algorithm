package Offer2;

public class Problem023 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        int c1 = 0;
        while(p1 != null) {
            ++c1;
            p1 = p1.next;
        }
        ListNode p2 = headB;
        int c2 = 0;
        while(p2 != null) {
            ++c2;
            p2 = p2.next;
        }
        int sum = Math.abs(c1 -c2);
        while(sum > 0) {
            if(c1 > c2) {
                headA = headA.next;
            } else {
                headB = headB.next;
            }
            --sum;
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

}
