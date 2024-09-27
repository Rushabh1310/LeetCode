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
        ListNode temp1 = head.next;
        ListNode dummy = new ListNode(0);
        ListNode temp2 = dummy;
        int sum = 0;
        while (temp1 != null) {
            if (temp1.val != 0) {
                sum += temp1.val;
            } else {
                temp2.next = new ListNode(sum);
                temp2 = temp2.next;
                sum = 0;
            }
            temp1 = temp1.next;
        }
        return dummy.next;
    }
}