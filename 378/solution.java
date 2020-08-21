/**
 * Definition for Doubly-ListNode.
 * public class DoublyListNode {
 *     int val;
 *     DoublyListNode next, prev;
 *     DoublyListNode(int val) {
 *         this.val = val;
 *         this.next = this.prev = null;
 *     }
 * } * Definition of TreeNode:
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
    /**
     * @param root: The root of tree
     * @return: the head of doubly list node
     */
    ArrayList<Integer> temp = new ArrayList<Integer>();
    public DoublyListNode bstToDoublyList(TreeNode root) {
        // write your code here
        if(root==null) return null;
        dfs(root);
        DoublyListNode res =new DoublyListNode(0);
        DoublyListNode r = res;
        for(Integer i: temp){
            DoublyListNode node = new DoublyListNode(i);
            r.next = node;
            node.prev = r;
            r=r.next;
        }
        r=res.next;
        r.prev = null;
        return r;
    }
    
    private void dfs(TreeNode root){
        if(root==null) return;
        if(root.left!=null) dfs(root.left);
        temp.add(root.val);
        if(root.right!=null)dfs(root.right);
    }
}