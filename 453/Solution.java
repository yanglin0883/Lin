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
        if(root == null) return;
        // System.out.println(root.val);
        flatten(root.left);
        flatten(root.right);
        TreeNode righrestOfLeft = null;
        if(root.left !=null){
            righrestOfLeft=rightOfLeft(root.left);
            righrestOfLeft.right= root.right;
            root.right = root.left;
            root.left=null;
        }
    }
    
    private TreeNode rightOfLeft(TreeNode root){
        TreeNode res = root;
        while(res.right!=null){
            res= res.right;
        }
        return res;
    }
}