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
     * @return: Postorder in ArrayList which contains node values.
     */
    List<Integer> al = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        doit(root);
        return al;
    }
    
    private void doit(TreeNode root)
    {
        if(root == null)
            return;
        doit(root.left);
        doit(root.right);
        al.add(new Integer(root.val));
    }
}