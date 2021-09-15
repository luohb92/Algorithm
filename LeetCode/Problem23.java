package LeetCode;

import java.util.PriorityQueue;

public class Problem23 {
    /**
     * 堆排序
     * 构建一个小顶堆
     * 堆顶是最小的值，每次取堆顶
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length <= 0) {
            return null;
        }
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode node: lists) {
            if (node != null) {
                queue.add(node);
            }
        }
        while(!queue.isEmpty()) {
            ListNode node = queue.remove();
            cur.next = node;
            cur = node;
            if(node.next != null) {
                queue.add(node.next);
            }
        }
        return pre.next;
    }
}
