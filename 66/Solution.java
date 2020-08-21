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
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    List<Integer> al = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        if(root == null)
            return null;
        doit(root);
        return al;
    }
    
    private void doit(TreeNode root)
    {
        al.add(root.val);
        if(root.left != null)
            doit(root.left);
        if(root.right != null)
            doit(root.right);
    }
}