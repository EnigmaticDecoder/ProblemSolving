// Last updated: 2/23/2026, 12:26:45 PM
// Iterative method
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
12    public ListNode swapPairs(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode prev = dummy;
16        ListNode first = null;
17        ListNode second = null;
18        while(prev.next!= null && prev.next.next!=null){
19            first = prev.next;
20            second = first.next;
21            first.next = second.next;
22            second.next = first;
23            prev.next = second;
24            prev = first;
25        }
26        return dummy.next;
27    }
28}