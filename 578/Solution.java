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
    /*
     * @param root: The root of the binary tree.
     * @param A: A TreeNode
     * @param B: A TreeNode
     * @return: Return the LCA of the two nodes.
     */
    boolean aExist=false, bExist=false;
    public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode A, TreeNode B) {
        dfs(root, A, B);
        if(aExist&&bExist) return lowestCommonAncestor(root, A,B);
        else return null;
    }
    
    private void  dfs(TreeNode root, TreeNode A, TreeNode B){
        if(aExist&&bExist) return;
        if(root == A)aExist = true;
        if(root == B)bExist = true;
        if(root == null) return;
        dfs(root.left,A,B);
        dfs(root.right,A,B);
    }
    
    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        if(root == null || root==A||root == B)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, A, B);
        TreeNode right = lowestCommonAncestor(root.right, A, B);
        if(left != null && right != null) return root;
        if(left != null) return left;
        if(right != null) return right;
        return null;
    }
}