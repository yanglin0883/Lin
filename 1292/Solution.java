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
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode odd = new ListNode(0);
        ListNode even =new ListNode(0);
        ListNode iOdd =odd;
        ListNode iEven =even;
        boolean flag =true;
        while(head!= null){
            if(flag){
                iOdd.next = new ListNode(head.val);
                iOdd = iOdd.next;
            }
            else{
                iEven.next = new ListNode(head.val);
                iEven = iEven.next;
            }
            flag = !flag;
            head = head.next;
        }
        iOdd.next = even.next;
        return odd.next;
    }
}