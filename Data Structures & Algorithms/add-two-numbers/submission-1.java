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
        // tworzymy sobie dummy Node zeby do niego "dokladac" obliczone elementy

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // tworzymy sobie zamienna, ktora bedzie sluzyla nam za reszte z dodawania do 10
        int carry = 0;
        // bedziemy iterowac do momenty gdy l1 lub l2 nie beda nullami lub reszta nie bedzie rowna 0
        // -! l1 i l2 moga miec rozne dlugosci!!!

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // obliczamy co zapisujemy- to jak dodawanie w slupku
            int val = val1 + val2 + carry;
            carry = val / 10;
            val = val % 10;
            current.next = new ListNode(val);

            current = current.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummy.next;
    }
}
