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
        if(head == null ||head.next ==null) return head;
        ListNode mid = middle(head);
        // System.out.println(mid.val+" "+mid.next);
        ListNode right = null;
        if(mid !=null) right=sortList(mid.next);
        mid.next= null;
        ListNode left = sortList(head);
        return mergeSortedList(left,right);
    }
    
    private ListNode middle(ListNode head){
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null&&fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private ListNode mergeSortedList(ListNode left,ListNode right){
        if(left == null) return right;
        else if(right == null) return left;
        ListNode res;
        if(left.val<right.val){
            res = left;
            left = left.next;
        }
        else{
            res = right;
            right = right.next;
        }
        ListNode temp = res;
        while(left!=null &&right != null)
            if(left.val<=right.val){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
            else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        // for(ListNode i = left;i!= null;i=i.next)
        //     System.out.print(i.val+" ");
        // System.out.println();
        // for(ListNode i = right;i!= null;i=i.next)
        //     System.out.print(i.val+" ");
        if(left!= null) temp.next = left;
        if(right!= null) temp.next = right;
        return res;
    }
}