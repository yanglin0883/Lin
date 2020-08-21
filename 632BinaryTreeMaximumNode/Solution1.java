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
 //2073ms
public class Solution {
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        if(root.left == null) return max(root, maxNode(root.right));
        if(root.right == null) return max(root, maxNode(root.left));
        return max(root,maxNode(root.left),maxNode(root.right));
    }
    
    private TreeNode max(TreeNode a,TreeNode b)
    {
        return (a.val > b.val) ? a:b;
    }
    
    private TreeNode max(TreeNode a,TreeNode b, TreeNode c)
    {
        return max(max(a,b),c);
    }
}