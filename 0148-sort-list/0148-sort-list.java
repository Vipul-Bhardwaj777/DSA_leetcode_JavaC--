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
    public ListNode sortList(ListNode head) {
        
        if( head == null || head.next == null) return head;
        
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return merge(left, right);
    
        
        
    }
    
    
    
     ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    
    
    
    
    
    
    ListNode merge(ListNode h1, ListNode h2) {
        
      // first create an node with val = 0 (as null node can't access next nodes) to add new nodes next to it which are from list1 or list2 
        
        ListNode head = new ListNode(0);
        ListNode curr = head;                      // curr will also point to 0 node but will be used to move forward and                                                       head will have ans node just next to it
        
        while(h1 != null && h2 != null){           // if one is null loop will break
            
            if(h1.val < h2.val){
                curr.next = h1;   // curr pointer doesnot move, it's just refrencing next position
                h1 = h1.next;
                curr = curr.next; // here current moves
            }
            
            else{
                curr.next = h2;
                h2 = h2.next;
                curr = curr.next;
            }
        }
        
        // loop ends and if any list becomes empty (h1,h2) becomes null we add the next head which is not empty and that head will add whole list as list nodes are connected to each other
        
        if(h1 != null) curr.next = h1;
        if(h2 != null) curr.next = h2;
        
        return head.next;
    }
}