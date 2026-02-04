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
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;     // will become new head
        ListNode curr = head;     // start from first node
        
        while (curr != null) {
            ListNode next = curr.next;  // Step 1: store next
            curr.next = prev;           // Step 2: reverse link
            prev = curr;                // Step 3: move prev
            curr = next;                // Step 4: move curr
        }
        
        return prev;   // prev is new head
    }
}

    