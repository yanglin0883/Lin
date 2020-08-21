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
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    public TreeNode sortedListToBST(ListNode head) {
        // write your code here
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast=head.next, slow=dummy;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode res = new TreeNode(slow.next.val);
        res.right = sortedListToBST(slow.next.next);
        slow.next = null;
        res.left = sortedListToBST(dummy.next);
        return res;
    }
}