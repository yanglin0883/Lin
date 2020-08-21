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
     * @param root: the root of binary tree
     * @return: collect and remove all leaves
     */
    public List<List<Integer>> findLeaves(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root == null) return res;
        while(root != null)
        {
            ArrayList<Integer> leaf = new ArrayList<Integer>();
            if(root.left ==null &&root.right ==null){
                leaf.add(root.val);
                root = null;
            }
            else dfs(root, leaf);
            res.add(leaf);
        }
        return res;
    }
    
    private void dfs(TreeNode root, ArrayList<Integer> leaf)
    {
        
        if(root.left == null &&root.right == null)
        {
            leaf.add(root.val);
            return;
        }
        if(root.left != null)
        {
            if(root.left.left == null &&root.left.right == null)
            {
                leaf.add(root.left.val);
                root.left = null;
            }
            else dfs(root.left, leaf);
        }
        if(root.right != null)
        {
             if(root.right.left == null &&root.right.right == null)
            {
                leaf.add(root.right.val);
                root.right = null;
            }
            else dfs(root.right, leaf);
        }
    }
}