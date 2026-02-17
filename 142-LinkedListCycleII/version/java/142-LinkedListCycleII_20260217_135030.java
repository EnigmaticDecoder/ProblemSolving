// Last updated: 2/17/2026, 1:50:30 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        boolean flag = true;
17        while(fast!=null && fast.next!=null){
18            slow = slow.next;
19            fast = fast.next.next;
20            if(slow == fast){
21                flag = false;
22                break;
23            }
24        }
25        if(flag) return null;
26        slow = head;
27        while(true){
28            if(slow==fast) return slow;
29            slow = slow.next;
30            fast = fast.next;
31        }
32    }
33}