// Last updated: 2/24/2026, 9:20:05 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode result = new ListNode(0);
14        ListNode curr = result;
15        int carry = 0;
16        while (l1!=null || l2!= null || carry !=0) {
17            int x = (l1 != null)?l1.val:0;
18            int y = (l2 != null)?l2.val:0;
19            int sum = x + y + carry;
20            carry = sum / 10;
21            int digit = sum % 10;
22            curr.next = new ListNode(digit);
23            curr = curr.next;
24            if (l1 != null) l1 = l1.next;
25            if (l2 != null) l2 = l2.next;
26        }
27        return result.next;
28    }
29}