// Last updated: 2/17/2026, 10:09:01 AM
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
14        while(head!=null && head.val==val){
15            head=head.next;
16        }
17        ListNode p = head;
18        ListNode q = head;
19        while(p!=null){
20            if(p.val==val){
21                q.next=p.next;
22                p=p.next;
23            }
24            else{
25                q=p;
26            p=p.next;
27            }
28        }
29        return head;
30    }
31}