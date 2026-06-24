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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> ln = new ArrayList<>();
        ListNode curr = head;

        while(curr != null) {
            ln.add(curr);
            curr = curr.next;
        }

        int size = ln.size();
        if(n == size) return head.next;

        ListNode prev = ln.get(size - n - 1);
        prev.next = prev.next.next;

        return head;
    }
}
