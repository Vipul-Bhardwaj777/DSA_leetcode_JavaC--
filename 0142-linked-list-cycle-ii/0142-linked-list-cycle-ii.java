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
    public ListNode detectCycle(ListNode head) {
        
         // first find the length of the cycle
        
        int length = 0;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                
                ListNode temp = slow;
                
                do{
                    temp = temp.next;
                    length++;
                }
                while(temp != slow);
                break;                   // break the loop as there's no return statement 
            }
        }
        
        if(length == 0) return null;     // no cycle present then return null
        
        
        // Now we know the lenght of cycle, so move second pointer length times and then f++ snd s++ will meet at ans
        
        ListNode first = head;
        ListNode second = head;
        
        while( length > 0){
        second = second.next;
            length--;
        }
        
        while(first != second){
            first = first.next;
            second = second.next;
        }
        
        return second;
        
    }
}