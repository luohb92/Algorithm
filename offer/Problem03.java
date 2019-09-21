import java.util.ArrayList;

public class Problem03 {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        printListFromTailToHead(root);

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        ListNode slow = null;
        ListNode fast = listNode;
        while(fast != null) {
            ListNode node = fast.next;
            fast.next = slow;
            slow = fast;
            fast = node;
        }
        while(slow != null) {
            result.add(slow.val);
            System.out.print(slow.val);
            slow = slow.next;
        }
        return result;
    }
     
    static class ListNode {
    public int val;

    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
    }
}