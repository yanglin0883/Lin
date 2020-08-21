/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class Solution {
    /*
     * @param root: The root of the BST.
     * @param p: You need find the successor node of p.
     * @return: Successor of p.
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // write your code here
        if(root == null) return null;
        if(root.val <= p.val){
            return inorderSuccessor(root.right, p);
        }
        TreeNode left = inorderSuccessor(root.left, p);
        return left == null ? root: left;
    }
}