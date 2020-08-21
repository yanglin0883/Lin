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
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head == null || head.next == null) return head;
        ListNode left = new ListNode(0);
        ListNode iLeft = left;
        ListNode right = new ListNode(0);
        ListNode iRight = right;
        while(head != null){
            System.out.println(head.val+"::"+iLeft.val+" == "+iRight.val);
            if(head.val< x){
                iLeft.next = new ListNode(head.val);
                iLeft = iLeft.next;
            }
            else{
                iRight.next = new ListNode(head.val);
                iRight = iRight.next;
            }
            head = head.next;
        }
        iLeft.next= right.next;
        return left.next;
    }
}