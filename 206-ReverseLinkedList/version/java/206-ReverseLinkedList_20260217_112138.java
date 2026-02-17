// Last updated: 2/17/2026, 11:21:38 AM
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
12    public ListNode reverseList(ListNode head) {
13        if(head == null || head.next == null) return head;
14        ListNode prev = head;
15        ListNode cur = prev.next;
16        ListNode next = cur.next;
17        prev.next = null;
18        while(cur.next!=null){
19            cur.next = prev;
20            prev = cur;
21            cur = next;
22            next = next.next;
23        }
24        cur.next = prev;
25        return cur;
26    }
27}