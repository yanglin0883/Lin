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
        return soredLTBST(head, null);
    }
    
    private TreeNode soredLTBST(ListNode head, ListNode tail){
        if(head == tail) return null;
        ListNode mid = head;
        ListNode temp = head;
        boolean flag = true;
        while(temp!=tail){
            temp= temp.next;
            flag = !flag;
            if(flag) mid = mid.next;
        }
        TreeNode res = new TreeNode(mid.val);
        res.left = soredLTBST(head, mid);
        res.right = soredLTBST(mid.next, tail);
        return res;
    }
}