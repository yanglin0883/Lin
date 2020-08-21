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
        if(head ==null ||head.next == null) return head;
        ListNode rear = head;
        int len =1;
        while(rear.next != null)
        {
            len++;
            rear = rear.next;
        }
        k %= len;
        if(k==0)return head;
        // System.out.println(k+"++"+len);
        ListNode res=null;
        ListNode newRear= head;
        for(int i=1;i< len-k;i++){
            newRear = newRear.next;
            // System.out.println(newRear.val+"");
        } 
        res = newRear.next;
        newRear.next = null;
        rear.next=head;
        return res;
    }
}