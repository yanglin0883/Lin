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
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        dfs(root);
        return res;
    }
    boolean res = true;
    int dfs(TreeNode root){
        if(!res) return 0;
        if(root==null) return 0;
        int left=dfs(root.left);
        int right = dfs(root.right);
        if(Math.abs(left-right)>1) {res = false;return 0;}
        return 1+Math.max(left, right);
    } 
}