// Last updated: 2/22/2026, 3:06:53 PM
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
12    public ListNode sortList(ListNode head) {
13        ListNode temp = head;
14        ArrayList<Integer> list = new ArrayList<>();
15        while(temp!=null){
16            list.add(temp.val);
17            temp = temp.next;
18        }
19        temp = head;
20        Collections.sort(list);
21        for(int num : list){
22            temp.val = num;
23            temp = temp.next;
24        }
25        return head;
26    }
27}