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
    public void reorderList(ListNode head) {
        
        // Can't move backward so reverse the list and add
        
        ListNode mid = getmid(head);
        ListNode revhead = reverse(mid);
        
        ListNode s = head;
        ListNode e = revhead;
        
        while(s != null && e != null){
            
            ListNode temp = s.next;       // save origional s.next if not done then ans list s will be used
            s.next = e;
            s = temp;
            
            temp = e.next;
            e.next = s;
            e = temp;
            
           }
        
        
         if(s != null) s.next = null;     // last node not already null so make it null
        
        
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