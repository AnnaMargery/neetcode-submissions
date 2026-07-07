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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int rest = 0;
        while (l1 != null || l2 != null || rest != 0) {
            int l1digit = (l1 == null) ? 0 : l1.val;
            int l2digit = (l2 == null) ? 0 : l2.val;

            int sum = l1digit + l2digit + rest;
            int digit = sum % 10;
            rest = sum / 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummy.next;
    }
}
