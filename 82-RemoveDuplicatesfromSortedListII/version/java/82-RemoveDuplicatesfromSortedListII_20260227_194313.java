// Last updated: 2/27/2026, 7:43:13 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head==null || head.next == null) return head;
14        ListNode dummy = new ListNode(-101);
15        dummy.next = head;
16        ListNode prev = dummy;
17        ListNode temp = head;
18        ListNode curr = head.next;
19        int count = 0;
20        while(curr!=null){
21            if(temp.val == curr.val) count++;
22            else{
23                if(count>0){
24                    temp = curr;
25                    prev.next = curr;
26                    count = 0;
27                }else{
28                    temp = temp.next;
29                    prev = prev.next;
30                }
31            }
32            curr = curr.next;
33        }
34        if(count>0){
35                    temp = curr;
36                    prev.next = curr;
37                    }
38        return dummy.next;
39    }
40}