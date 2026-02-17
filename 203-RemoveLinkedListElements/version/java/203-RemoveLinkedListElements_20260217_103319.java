// Last updated: 2/17/2026, 10:33:19 AM
// Solve using dummy;
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
12    public ListNode removeElements(ListNode head, int val) {
13        if(head==null) return head;
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16        ListNode cur = dummy;
17        while(cur.next!=null){
18            if(cur.next.val == val){
19                cur.next = cur.next.next;
20            }
21            else cur = cur.next;
22        }
23        return dummy.next;
24    }
25}