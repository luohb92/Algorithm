package cracking;

import java.util.ArrayList;
import java.util.List;

public class Problem0206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }

    /**
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size() -1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}
