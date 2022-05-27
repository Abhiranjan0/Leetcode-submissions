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
    
    public ListNode middle(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null)
            return prev;
        return slow;
    }
    
     ListNode merge2List(ListNode head1, ListNode head2) {
         if(head1 == null) return head2;
         if(head2 == null) return head1;
         ListNode dummy = new ListNode(-1);
         ListNode head = dummy, tail = dummy; 
         
         while(head1 != null && head2 != null) {
           if(head1.val < head2.val) {
               tail.next = head1;
               head1 = head1.next;
           }
           
           else {
               tail.next = head2;
               head2 = head2.next;
           }
           tail = tail.next;
       }
       if(head1 != null) tail.next = head1;
       else tail.next = head2;
       return dummy.next;
   }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode mid = middle(head);
        ListNode midNext = mid.next;
        mid.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        
        return merge2List(left, right);
    }
}