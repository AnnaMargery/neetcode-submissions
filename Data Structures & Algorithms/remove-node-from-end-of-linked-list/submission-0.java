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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            nodes.add(current);
            current = current.next;
        }

        int amount = nodes.size();
        int indexToRemove = amount - n;

        if (indexToRemove == 0) {
            return head.next;
        }

        ListNode before = nodes.get(indexToRemove - 1);
        before.next = nodes.get(indexToRemove).next;
        return head;
    }
}
