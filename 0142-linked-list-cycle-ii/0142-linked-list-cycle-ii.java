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
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            // If the pointers meet, there is a cycle in the linked list
            if (slow == fast) {
                // Reset the slow pointer to the head of the list
                slow = head;
                
                // Move both pointers one step at a time until they meet again
                // The meeting point is the starting node of the cycle
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                // Return the node where the cycle begins
                return slow;
            }
        }

        return null;
    }
}