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
     * @return: An integer
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        dfs(root, 0);
        return max;
    }
    int max = 0;
    void dfs(TreeNode root, int depth){
        if(root==null) return ;
        max = Math.max(max, ++depth);
        dfs(root.left, depth);
        dfs(root.right, depth);
    }
}