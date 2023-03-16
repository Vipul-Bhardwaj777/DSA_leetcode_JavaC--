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
    public ListNode reverseKGroup(ListNode head, int k) {
        
         if (k <= 1 || head == null) {
            return head;
        }
        
            ListNode prev = null;
            ListNode pres = head;
            ListNode next = pres.next;
            
           
        
        int length = getlenght(head);
        int count = length / k;                  // divide LL into k groups and only reverse that no of groups
        
        
        while(count > 0){                        // run till no of reversing pairs are reversed 
            
            ListNode newend = pres;
            ListNode last = prev;
            
            for(int i = 0; i < k; i ++){
                
                pres.next = prev;
                prev = pres;
                pres = next;
                
                if(next != null) next = next.next;
            }
            
            if(last != null) last = last.next = prev;
            
            else{
                 head = prev;
            }
            
            newend.next = pres;
            
            prev = newend;                                    // this is for next pair 
        
        count--;
        }
        
        return head;
        
            
    }
    
    
    
  public static  int getlenght(ListNode head){
        
        int l = 0;
        ListNode node = head;
        while(node != null){
            node = node.next;
            l++;
        }
        return l;
    }
    
    
}