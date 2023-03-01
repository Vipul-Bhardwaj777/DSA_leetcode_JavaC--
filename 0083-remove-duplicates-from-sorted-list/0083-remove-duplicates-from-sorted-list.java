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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode node = head; // head is node pointer pointing head so create node pointer and change LL
        
        if(node == null) return node; // if LL is empty
        
          while(node.next != null){
              
            if(node.val == node.next.val){          // if duplicate is there skip it
                
                node.next = node.next.next;
            }
            
            else{
               node = node.next;       // if no duplicate move forward
            }
        }
        
        return head;   // return the head pointer after changing LL
    }
}