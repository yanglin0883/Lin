/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: Nth to last node of a singly linked list. 
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if(head == null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        for(int i=1;i<n;i++)
            fast = fast.next;
    //        System.out.println("fast= "+fast.val);
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
    //    System.out.println("fast= "+fast.val);
     //   System.out.println("slow= "+slow.val);
        return slow;
    }
}