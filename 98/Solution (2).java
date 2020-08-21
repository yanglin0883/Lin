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
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list, using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if(head==null||head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        sort(dummy);
        return dummy.next;
    }
    
    void sort(ListNode dummy){
        if(dummy.next==null || dummy.next.next==null) return;
        ListNode fast=dummy, slow=dummy;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secHalf = new ListNode(0);
        secHalf.next = slow.next;
        slow.next = null; //divide
        
        sort(dummy);
        sort(secHalf);//conque
        
        ListNode p1=dummy, p2=secHalf.next;//combine
        while(p1.next!=null&&p2!=null){
            //System.out.println(p1.next.val+"  "+p2.val);
            if(p1.next.val<p2.val){
                p1 = p1.next;
            }
            else{
                ListNode temp = p1.next;
                p1.next = p2;
                ListNode temp2 = p2.next;
                p2.next = temp;
                p1 = p2;
                p2 = temp2;
            }
        }
        // print(p1);
        // print(p2);
        if(p1.next==null)p1.next =p2;
    }
    void print(ListNode head){
        while(head!=null) {System.out.print("  "+head.val);head = head.next;}
        System.out.println();
    }
}