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
    public boolean isPalindrome(ListNode head) {
        
        // We cant move backward in singly LL so compare by reversing from mid 
        
        
        ListNode mid = getmid(head);             // Find the mid node and reverse from mid to end
        ListNode reversehead = reverse(mid);
        
        ListNode f = head;
        ListNode s = reversehead;
        
        while(f != null && s != null){           // Now use two pointers to compare if the are equal
            
            if(f.val == s.val){

            f = f.next;
            s = s.next;
            }
            
            else{ break; }
            
        }
        
        return f == null || s == null;           // return true if f or s becomes null i.e the entire LL is traversed
    }
    
    ListNode getmid(ListNode head){
        
        ListNode f = head;
        ListNode s = head;
        
        while(f != null && f.next != null){
            
            f = f.next.next;
            s = s.next;
        }
        
        return s;
    }
    
    ListNode reverse(ListNode head){
        
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        
        while(pres != null){
            
            pres.next = prev;
            prev = pres;
            pres = next;
            
            if( next != null) next = next.next;
        }
        
        return prev;

    }
    
    
}