/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // Cycle is present in the question so we use fast and slow pointer method
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow) return true;  // if fast and slow meet at any point, it means cycle is present
        }
        
        return false;
    }
}