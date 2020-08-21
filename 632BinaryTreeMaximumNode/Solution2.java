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
 //2113ms
public class Solution {
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if( root == null ) return null;
        TreeNode max = root;
        return maxNo(max, root);
    }
    
    private TreeNode maxNo(TreeNode max, TreeNode root){
        if( root == null ) return null;
        //System.out.println(root.val);
        if( root.left != null ){
            max = maxNo(max, root.left);
        }
        if( root.right != null ){
            max = maxNo( max, root.right );
        }
        if( root.val > max.val ) {
            max = root;
        }
        return max;
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