// Last updated: 2/18/2026, 12:20:58 AM
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
12    public boolean isPalindrome(ListNode head) {
13        if(head.next == null) return true;
14        ListNode slow = head;
15        ListNode fast = head;
16        while(fast!=null && fast.next!=null){
17            slow = slow.next;
18            fast = fast.next.next;
19        }
20
21        ListNode prev = null;
22        ListNode cur = slow;
23        while(cur!=null){
24            ListNode next = cur.next;
25            cur.next = prev;
26            prev = cur;
27            cur = next;
28        }
29        ListNode left = head;
30        ListNode right = prev;
31        while (right != null) {
32        if (left.val != right.val) return false;
33        left = left.next;
34        right = right.next;
35    }
36         return true;
37    }
38}