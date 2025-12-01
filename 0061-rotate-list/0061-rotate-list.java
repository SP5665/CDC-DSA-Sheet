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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int nodes = 1;
        while (temp.next != null) {
            nodes++;
            temp = temp.next;
        }
        int r = k%nodes;
        ListNode prev = head;
        int c=1;
        while (c < nodes-r) {
            prev = prev.next;
            c++;
        }
        temp.next = head;
        head = prev.next;
        prev.next = null;
        return head;
    }
}