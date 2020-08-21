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
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode mth, nth, mthPre = dummy, nthNext;
        for(int i=1;i<n;i++){
            if(i==m-1) mthPre = head;
            head = head.next;
        }
        nth = head;
        nthNext = nth.next;
        mth = mthPre.next;
        
        nth.next = null;
        reverse(mth);
        mthPre.next = nth;
        mth.next = nthNext;
        return dummy.next;
    }
    
    private void reverse(ListNode head){
        ListNode pre=null;
        while(head!= null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
    }
}