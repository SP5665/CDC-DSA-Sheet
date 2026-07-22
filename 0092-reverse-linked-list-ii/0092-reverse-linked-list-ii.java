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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode beforeLeft = null;

        int pos = 1;
        while (pos < left) {
            beforeLeft = curr;
            curr = curr.next;
            pos++;
        }

        ListNode leftNode = curr;
        int count = right - left + 1;

        while (count>0) {
            ListNode fut = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fut;
            count--;
        }
        if (beforeLeft != null)
            beforeLeft.next = prev;
        else
            head = prev;
        leftNode.next = curr;
        return head;
    }
}