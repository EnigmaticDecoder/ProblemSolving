// Last updated: 2/10/2026, 3:29:40 PM
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
        ListNode result = new ListNode(0);
        ListNode curr = result;

        int carry = 0;

        while (l1!=null || l2!= null || carry !=0) {

            int x = (l1 != null)?l1.val:0;
            int y = (l2 != null)?l2.val:0;

            int sum = x + y + carry;

            carry = sum / 10;
            int digit = sum % 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return result.next;
    }
}