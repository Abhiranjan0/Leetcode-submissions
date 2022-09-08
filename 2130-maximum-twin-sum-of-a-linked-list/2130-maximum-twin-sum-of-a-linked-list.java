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
    public int pairSum(ListNode head) {
       
       ListNode slow=head, fast=head;
       while(fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
       } 
        
        fast = head;
        slow = reverse(slow);
        int max = Integer.MIN_VALUE;
        
        while(slow != null) {
           max = Math.max(max, fast.val + slow.val);
            slow = slow.next;
            fast = fast.next;
        }
        return max;
    }
    
    
    ListNode reverse(ListNode node) {
       if(node == null || node.next == null) return node;
        
       ListNode temp = reverse(node.next);
       node.next.next = node;
       node.next = null;
        
       return temp; 
    }
}