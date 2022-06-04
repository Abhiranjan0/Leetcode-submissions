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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy;
        ListNode temp = head;
        
        temp = temp.next;
        int sum = 0;
        while(temp != null) {
            
            while(temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            
            slow.next = new ListNode(sum);
            slow = slow.next;
            temp = temp.next;
            sum = 0;
        }
        return dummy.next;
    }
}