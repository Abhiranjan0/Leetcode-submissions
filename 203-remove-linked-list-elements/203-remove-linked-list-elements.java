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
    public ListNode removeElements(ListNode head, int val) {
       ListNode dummy = new ListNode(-1);
       ListNode tail = dummy, curr = head;
        
       while(curr != null) {
           if(curr.val != val) {
               tail.next = new ListNode(curr.val);
               tail = tail.next;
           }
           curr = curr.next;
       } 
        return dummy.next;
    }
}