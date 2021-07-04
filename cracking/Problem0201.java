package cracking;

import java.util.HashSet;

public class Problem0201 {
    /**
     * 遍历链表用一个set保存遍历的值
     * 使用快慢指针
     * 当set中存在fast指针的值时，删除fast这个节点
     * 不存在的时候将值add进set中，然后slow和fast指针往前走一步
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode slow = head;
        ListNode fast = head.next;
        set.add(slow.val);
        while (fast != null) {
            if (set.contains(fast.val)) {
                fast = fast.next;
                slow.next = fast;
            } else {
                set.add(fast.val);
                slow = slow.next;
                fast = fast.next;
            }
        }
        return head;

    }
}
