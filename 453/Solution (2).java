/**
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
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        // write your code here
        flat(root);
    }
    TreeNode flat(TreeNode root){
        if(root==null) return null;
        // if(root.left==null) return root;
        TreeNode leftLast = flat(root.left);
        TreeNode rightLast = flat(root.right);
        if(leftLast!=null){
            leftLast.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if(rightLast!=null) return rightLast;
        if(leftLast!=null) return leftLast;
        return root;
    }
}