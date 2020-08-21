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
     * @param head: a singly linked list
     * @return: Modified linked list
     */
    public ListNode oddEvenList(ListNode head) {
        // write your code here
        if(head==null||head.next == null) return head;
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode i=odd, j=even;
        boolean flag = true;
        while(head!=null){
            if(flag){
                i.next = head;
                i=i.next;
            }else{
                j.next = head;
                j = j.next;
            }
            head = head.next;
            flag = !flag;
        }
        j.next = null;
        i.next = even.next;
        return odd.next;
    }
}