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
     * @param root: The root of binary tree
     * @return: root of new tree
     */
    public TreeNode cloneTree(TreeNode root) {
        // write your code here
        if(root==null) return null;
        return dfs(root);
    }
    
    private TreeNode dfs(TreeNode root){
        if(root == null) return null;
        TreeNode res = new TreeNode(root.val);
        if(root.left != null)res.left= dfs(root.left);
        if(root.right != null) res.right = dfs(root.right);
        return res;
    }
}