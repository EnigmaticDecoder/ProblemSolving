// Last updated: 2/10/2026, 3:28:56 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=null){
            while(tempB != null){
            if(tempA == tempB) return tempA;
            tempB = tempB.next;
            }
            tempA = tempA.next;
            tempB = headB;
        }
        return null;
    }
}
