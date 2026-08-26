/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode middle = findMiddleNode(head);
        ListNode reversed = reverseList(middle);
        return compareLists(head, reversed);
    }

    private ListNode findMiddleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode node) {
        ListNode before = null;
        ListNode current = node;

        while (current != null) {
            ListNode after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
        return before;
    }

    private boolean compareLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return true;
    }
}
