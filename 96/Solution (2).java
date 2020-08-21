/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head==null||head.next==null) return head;
        ListNode big = new ListNode(0);
        ListNode small = new ListNode(0);
        ListNode pb = big, ps = small;
        while(head!=null){
            if(head.val>=x){
                pb.next = head;
                pb = pb.next;
            }
            else {
                ps.next = head;
                ps = ps.next;
            }
            head = head.next;
        }
        pb.next = null;
        ps.next = big.next;
        return small.next;
    }
}