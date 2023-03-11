/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        // fast runs 2X the speed of slow so when fast will be at end slow will be at middle
        
        ListNode f = head;
        ListNode s = head;
        
        while(f != null && f.next != null){
            
            f = f.next.next;
            s = s.next;
        }
        
        return s;
    }
}