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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        } else {
            ListNode dummyNode = new ListNode(0);
            dummyNode.next = head;
            ListNode prev = dummyNode;
            ListNode current = dummyNode.next;

            while (current != null) {
                if (current.val != val) {
                    prev = current;
                } else {
                    prev.next = current.next;
                }
                current = current.next;
            }
            return dummyNode.next;
        }
    }
}