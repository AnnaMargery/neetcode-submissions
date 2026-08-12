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
    public void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // now i know that the fast is at the end
        // now i know that the slow is in the middle
        // this will be a part to split those two

        ListNode current = slow.next;
        ListNode before = slow.next = null;

        while(current != null){
            ListNode after = current.next;

            current.next = before;
            before = current;
            current = after;
        }

        // my before is the head of the reversed linkedlist

        ListNode first = head;   // [2 , 4]
        
        current = before;    // [8 , 6]

        while(current !=null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = current.next;

            first.next = current;
            current.next = tmp1;
            first = tmp1;
            current = tmp2;
        }
    }
}
