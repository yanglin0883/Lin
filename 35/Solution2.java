public class Solution {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode forward = current.next;
        while(forward != null){
            current.next = prev;
            prev = current;
            current = forward;
            forward = forward.next;
        }
        current.next = prev;
        return current;
    }
}