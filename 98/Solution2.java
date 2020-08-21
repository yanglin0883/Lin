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
    
    ListNode sort(ListNode dummy){
        if(dummy.next==null ) return dummy;
        ListNode pivot = dummy.next;
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode p = pivot.next, pl = left, pr = right;
        while(p!=null){
            if(p.val<pivot.val){
                pl.next = p;
                pl = pl.next;
            }else{
                pr.next = p;
                pr = pr.next;
            }
            p = p.next;
        }
        pl.next = null;
        pr.next = null;
        
        pl = sort(left);
        pr = sort(right);
        
        if(left.next!=null &&right.next!=null){
            pl.next = pivot;
            pivot.next = right.next;
            pr.next = null;
            dummy.next = left.next;
            return pr;
        }
        else if(left.next!=null){
            pl.next = pivot;
            pivot.next=null;
            dummy.next  =left.next;
            return pivot;
        }
        else if(right.next!=null){
            pivot.next = right.next;
            pr.next = null;
            return pr;
        }
        else{
            return pivot;
        }
    }
    void print(ListNode head){
        while(head!=null) {System.out.print("  "+head.val);head = head.next;}
        System.out.println();
    }
}