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

    /**
     * 暴力解法
     * 遍历headA中的节点看是否在headB中
     * O(mn) 的时间，O(1) 的空间
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        for(ListNode headA1 = headA; headA1 != null; headA1= headA1.next) {
            for(ListNode headB1 = headB; headB1 != null; headB1 = headB1.next) {
                if(headA1 == headB1) {
                    return headA1;
                }
            }
        }
        return null;
    }

    /**
     * 哈希解法
     * 遍历headA 将headA中所有的节点放到Set中
     * 遍历headB, 如何某个节点存在Set中则返回
     * 遍历完headB后都没有，则说明没有相
     * O(n) 的时间，O(1) 的空间
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode ha = headA;
        ListNode hb = headB;
        Set<ListNode> set = new HashSet<>();
        while (ha != null){
            set.add(ha);
            ha = ha.next;
        }
        while(hb != null) {
            if(set.contains(hb)) {
                return hb;
            }
            hb = hb.next;
        }
        return null;
    }
}