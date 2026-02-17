// Last updated: 2/18/2026, 12:43:47 AM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null) return head;
14        ListNode temp = head;
15        ListNode newhead = head;
16        int count = 1;
17        while(temp.next!=null){
18            count++;
19            temp = temp.next;
20        }
21        k = k%count;
22        if(k==0) return head;
23        temp.next = head;
24        temp = head;
25        
26        count = count-k;
27        while(true){
28            if(count == 1) {
29                newhead = temp.next;
30                temp.next = null;
31                break;
32            }
33            count--;
34            temp = temp.next;
35        }
36        return newhead;
37    }
38}