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
     * @param root: param root: The root of the binary search tree
     * @param k1: An integer
     * @param k2: An integer
     * @return: return: Return all keys that k1<=key<=k2 in ascending order
     */
    ArrayList<Integer> al = new ArrayList<Integer>();
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        dfs(root,k1,k2);
        return al;
    }
    
    private void dfs(TreeNode root, int k1, int k2)
    {
        if(root == null) return;
        if(root.left != null) dfs(root.left, k1, k2);
        if(root.val>=k1 && root.val <=k2) al.add(root.val);
    //    System.out.println(root.val+"");
        if(root.right != null) dfs(root.right, k1, k2);
    }
}