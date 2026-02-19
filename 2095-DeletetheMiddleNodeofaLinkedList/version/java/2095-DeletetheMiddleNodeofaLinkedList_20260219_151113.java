// Last updated: 2/19/2026, 3:11:13 PM
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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head==null || head.next ==null) return null;
14        ListNode dummy = new ListNode(0);
15        ListNode slow = head;
16        ListNode fast = head;
17        dummy.next = head;
18        ListNode prev = dummy;
19        while(fast!=null && fast.next!=null){
20            slow = slow.next;
21            prev = prev.next;
22            fast = fast.next.next;
23        }
24        prev.next = slow.next;
25        dummy.next = null;
26        return head;
27    }
28}