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
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
        
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        
        while(head != null) {
            if(head.val < x) {
               curr1.next = new ListNode(head.val);
               curr1 = curr1.next; 
            }
            
            else {
               curr2.next = new ListNode(head.val);
               curr2 = curr2.next; 
            }
            head = head.next;
        }
        curr1.next = list2.next;
        return list1.next;
    }
}