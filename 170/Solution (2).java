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
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if(head==null||head.next==null) return head;
        ListNode p=head;
        int size=0;
        while(p!=null){
            size++;
            p = p.next;
        }
        k%=size;
        if(k==0) return head;
        k=size-k;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        p=dummy;
        for(int i=0;i<k;i++){
            p=p.next;
        }
        ListNode res = p.next;
        p.next = null;
        p=res;
        while(p.next!=null){p = p.next;}
        p.next = dummy.next;
        return res;
    }
}