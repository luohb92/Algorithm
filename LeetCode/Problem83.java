/**
 * LeetCode第83题
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次
 * 输入: 1->1->2
 * 输出: 1->2
 */
package LeetCode;
public class Problem83 {
    public static void main(String[] args) {
        
    }

    /**
     * 使用快慢指针
     * 慢指针slow初始化为head,快指针初始化为head.next
     * 遍历fast直到fast为null, 
     * 当slow的值等于fast的值时，需要去重，slow.next = fast.next, fast往前走一步 fast = fast.next
     * 当slow的值不等于fast的值时，不需要去重， slow和fast都往前走一步，slow = slow.next fast = fast.next
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null) {
            if(slow.val == fast.val) {
                slow.next = fast.next;
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return head;
    }

    /**
     * 只使用一个指针cur，初始化为head
     * 不断遍历cur直到cur 为空或者cur.next为空，这个时候则没有数据需要去重
     * 比较cur的值和cur.next的值
     * 如果相等则需要去重 cur.next = cur.next.next
     * 如果相等则cur往前走一步，cur = cur.next
     * @param head
     * @return
     */
    public ListNode deleteDuplicates1(ListNode head) {
        ListNode cur = head;
        while(cur != null && cur.next != null) {
            if(cur.val == cur.next.val ) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}