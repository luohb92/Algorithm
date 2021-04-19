package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem143 {
    public void reorderList(ListNode head) {
        List<ListNode> lists = new ArrayList<>();
        ListNode node = head;
        while(node != null) {
            lists.add(node);
            node = node.next;
        }
        int left = 0;
        int right = lists.size() -1;
        while(left < right) {
            lists.get(left).next = lists.get(right);
            ++left;
            if(left == right) {
                break;
            }
            lists.get(right).next = lists.get(left);
            --right;
        }
        lists.get(left).next = null;
    }
}
