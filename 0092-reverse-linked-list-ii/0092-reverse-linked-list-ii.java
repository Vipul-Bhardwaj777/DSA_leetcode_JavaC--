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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(left == right) return head;
        
        // Skip first left - 1 nodes
        
        ListNode prev = null;
        ListNode pres = head;
        
        for(int i = 0;  i < left - 1; i++){
            
                prev = pres;
                pres = pres.next;
        }
        
        // we have reached the desired positions as now pres = left and prev = pres - 1 
        // save last and newend for joining later 
        ListNode last = prev;
        ListNode newend = pres;
        
        // Now reverse fron left to right thorough prev pres and next
        
        ListNode next = pres.next;
        
        // now as earlier in reversal we will not run the loop till our pres becomes null, loop will run size of small              LL times i.e (right - left + 1)
        
        for(int i = 0;  i < right - left + 1; i++){
            
            pres.next = prev;
            prev = pres;
            pres = next;
            
            if( next != null) next = next.next;
        }
        
        if(last != null){             
          
            last.next = prev;
        }
        
        else{
            head = prev;
        }
        
        newend.next = pres;
        
        return head;
    }
}