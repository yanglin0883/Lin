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
        return dfs(root).flag;
    }
    Res dfs(TreeNode root){
        if(root==null) return new Res(true, 0);
        Res left = dfs(root.left);
        Res right = dfs(root.right);
        return new Res(left.flag&&right.flag&&Math.abs(left.depth-right.depth)<=1,
                        1+Math.max(left.depth, right.depth));
    }
    
    class Res{
        boolean flag;int depth;
        Res(boolean f, int d){
            flag =f; depth = d;
        }
    }
}