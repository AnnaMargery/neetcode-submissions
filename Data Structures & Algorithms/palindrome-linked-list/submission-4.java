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
        ListNode copy = copyList(head);
        ListNode reversed = reverse(copy);
        return compareLists(head, reversed);
    }

    private ListNode reverse(ListNode node) {
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
    private ListNode copyList(ListNode head) {
        if (head == null)
            return null;

        ListNode newHead = new ListNode(head.val);
        ListNode currentOld = head.next;
        ListNode currentNew = newHead;

        while (currentOld != null) {
            currentNew.next = new ListNode(currentOld.val);
            currentNew = currentNew.next;
            currentOld = currentOld.next;
        }
        return newHead;
    }

    private boolean compareLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val == list2.val) {
                list1 = list1.next;
                list2 = list2.next;
            } else {
                return false;
            }
        }
        return true;
    }
}