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

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int splitSize = size / k;

      
        int numRemainingParts = size % k;

        current = head;
        for (int i = 0; i < k; i++) {
            ListNode newPart = new ListNode(0);
            ListNode tail = newPart;

            int currentSize = splitSize;
            if (numRemainingParts > 0) {
                numRemainingParts--;
                currentSize++;
            }
            int j = 0;
            while (j < currentSize) {
                tail.next = new ListNode(current.val);
                tail = tail.next;
                j++;
                current = current.next;
            }
            ans[i] = newPart.next;
        }

        return ans;
    }
}