// Last updated: 2/19/2026, 7:50:11 AM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if(head.next==null && left == right) return head;
14
15        ListNode dummy = new ListNode(0);
16        dummy.next = head;
17        ListNode prev = dummy;
18
19        for(int i = 0; i<left; i++){
20            prev = prev.next;
21        }
22
23        ListNode cur = prev.next;
24        for(int i = 0; i<right-left; i++){
25            ListNode next = cur.next;
26            cur.next = prev;
27            prev = cur;
28            cur = next;
29        }
30        ListNode temp = dummy;
31        ListNode temp1 = dummy.next;
32        for(int i = 0; i<left-1; i++){
33            temp = temp.next;
34            temp1 = temp1.next;
35        }
36        temp1.next = cur;
37        temp.next = prev;
38        return dummy.next;
39    }
40}