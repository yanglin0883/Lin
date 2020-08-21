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
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        ListNode dummy =new ListNode(0);
        dummy.next = head;
        head = dummy;
        int index=1;
        for(;index<m;index++){
            head = head.next;
        }
        ListNode befo = head, end = head.next, prev = null;
        while(index<=n+1){
            index++;
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        befo.next = prev;
        end.next = head;
        return dummy.next;
    }
}