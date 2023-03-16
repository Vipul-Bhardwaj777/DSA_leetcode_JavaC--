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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        
        ListNode last = head;              // move last pointer from head to actual tail of LL
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }
        
        // loop is over and last is at tail

        last.next = head;                  // connect last to starting node 
        
        int rotations = k % length;
        
        int skip = length - rotations;     // skip and move newlast position that will be our new head of ans LL
        
        ListNode newLast = head;           // newlast is starting from head
        
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        
        // loop over so newlast node is reached at desired position
        
        head = newLast.next;
        
        newLast.next = null;

        return head;

    }
}