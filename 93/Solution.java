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
    boolean flag = true;//真的是二叉平衡树
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if(root ==null) return true;
        int leftDep=0;
        int rightDep=0;
        // int depth =0;
        if(flag && root.left!= null) leftDep = dfs(root.left);
        if(flag && root.right!= null) rightDep = dfs(root.right);
        return flag&&(abs(leftDep - rightDep) <= 1);
    }
    
    private int dfs(TreeNode root)
    {
        if(!flag) return 0;
        if(root.left == null && root.right == null) return 1;
        int leftDep=0, rightDep=0;
        if(root.left != null) leftDep = dfs(root.left);
        if(root.right != null)rightDep = dfs(root.right);
        if(abs(leftDep - rightDep)>1) flag = false;
        return (leftDep > rightDep)? (leftDep +1) : (rightDep +1);
    }
    
    private int abs(int a)
    {
        return (a>0)? a : -a;
    }
}