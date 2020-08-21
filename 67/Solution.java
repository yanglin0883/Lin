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
     * @return: Inorder in ArrayList which contains node values.
     */
    
    List<Integer> al = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        if(root == null)
            return null;
        doit(root);
        return al;
    }
    
    private void doit(TreeNode root)
    {
        if(root.left != null)
            doit(root.left);
        al.add(new Integer(root.val));
        if(root.right != null)
            doit(root.right);
    }
}