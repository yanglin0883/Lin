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
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        if(root==null) return true;
        dfs(root);
        return res;
    }
    boolean res = true;
    long[] dfs(TreeNode root){
        // 1st is min 2nd is max
        long[] t={Long.MAX_VALUE, Long.MIN_VALUE};
        if(!res||root==null) return t;
        long[]left = dfs(root.left);
        long[]right = dfs(root.right);
        if(left[1]>=root.val ||right[0]<=root.val){
            res = false;
            return t;
        }
        t[0] = Math.min(left[0], root.val);
        t[1] = Math.max(root.val, right[1]);
        return t;
    }
}