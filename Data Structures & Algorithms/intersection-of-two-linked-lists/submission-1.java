/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = calculateLength(headA);
        int lenB = calculateLength(headB);

        ListNode currA = headA;
        ListNode currB = headB;

        while (lenA > lenB) {
            currA = currA.next;
            lenA--;
        }
        while (lenB > lenA) {
            currB = currB.next;
            lenB--;
        }

        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }

        return currA;
    }

    private int calculateLength(ListNode node) {
        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}