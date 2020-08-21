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
    boolean res =true;
    long temp=-2147483649l;
    public boolean isValidBST(TreeNode root) {
        // write your code here
        if(root == null ||(root.left == null &&root.right == null)) return true;
        dfs(root);
        return res;
    }
    
    private void dfs(TreeNode root)
    {
        // System.out.println(res+"  "+root.val);
        if(!res) return;
        if(root.left == null && root.right == null)
        {
            if(root.val<=temp)
            {
                res = false;
                return;
            }
            else 
            {
                temp = root.val;
                return;
            }
        }
        if(root.left != null) dfs(root.left);
        if(root.val<=temp)
        {
            res = false;
            return;
        }
        else 
        {
            temp = root.val;
        }
        if(root.right != null) dfs(root.right);
    }
}