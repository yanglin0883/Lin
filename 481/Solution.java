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
     * @param root: the root of the binary tree
     * @return: An integer
     */
    int res=0;
    public int leafSum(TreeNode root) {
        // write your code here
        if(root == null) return 0;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root)
    {
        if(root == null) return;
        if(root.left == null && root.right == null) {res += root.val;return;}
        dfs(root.left);
        dfs(root.right);
    }
}