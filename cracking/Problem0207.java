package cracking;

import java.util.HashSet;

public class Problem0207 {
    /**
     * 空间复杂度O(1)
     * 时间复杂度O(n)
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int numA= 0, numB = 0;
        ListNode rowA = headA;
        ListNode rowB = headB;
        while (rowA != null) {
            ++numA;
            rowA = rowA.next;
        }
        while (rowB != null) {
            ++numB;
            rowB = rowB.next;
        }
        ListNode preA = headA;
        ListNode preB = headB;
        int size = 0;
        if(numB > numA) {
            size = numB - numA;
            while (size > 0) {
                --size;
                preB = preB.next;
            }
        } else {
            size = numA - numB;
            while (size > 0) {
                --size;
                preA = preA.next;
            }
        }
        while (preA != null && preB != null) {
            if (preA == preB) {
                return preA;
            }
            preA = preA.next;
            preB  = preB.next;
        }
        return null;
    }
}
