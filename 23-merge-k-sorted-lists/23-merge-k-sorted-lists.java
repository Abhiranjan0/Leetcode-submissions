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
    
    public int minNode(ListNode[] lists) {
        int min  = Integer.MAX_VALUE;
        int idx = -1;
        
        for(int i=0; i<lists.length; i++) {
            if(lists[i] != null && lists[i].val < min) {
            idx = i;
            min = lists[i].val;
        }
            
      }
        return idx;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            // 0 linked list
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy, tail = dummy;
        
        while(true) {
            int minIdx = minNode(lists);
            if(minIdx == -1)  break; 
            tail.next = lists[minIdx];
            lists[minIdx] = lists[minIdx].next;
            tail = tail.next;
        }
        return dummy.next;
    }
}