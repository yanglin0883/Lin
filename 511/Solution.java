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
     * @param head: a ListNode
     * @param v1: An integer
     * @param v2: An integer
     * @return: a new head of singly-linked list
     */
    public ListNode swapNodes(ListNode head, int v1, int v2) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l1=null,l2=null;
        head = dummy;
        while(head.next!=null){
            if(head.next.val==v1)l1 = head;
            if(head.next.val==v2) l2 = head;
            head = head.next;
        }
        if(l1==null||l2==null) return dummy.next;
        if(l1.next==l2){
            l1.next = l2.next;
            l2.next = l2.next.next;
            l1.next.next = l2;
            return dummy.next;
        }
        if(l2.next==l1){
            l2.next = l1.next;
            l1.next = l1.next.next;
            l2.next.next = l1;
            return dummy.next;
        }
        //System.out.println(l1.val+"  "+l2.val);
        ListNode temp = l1.next.next;
        l1.next.next = l2.next.next;
        l2.next.next = temp;
        
        //System.out.println(l1.next.next+"  "+l2.next.next+"  "+temp.val);
        temp = l2.next;
        l2.next = l1.next;
        l1.next = temp;
        
        //System.out.println(l1.next.next.val+"  "+l2.next.next+"  "+temp.val);
        // head = dummy;
        // while(head!=null) System.out.print(head.val+"  ");
        return dummy.next;
    }
}