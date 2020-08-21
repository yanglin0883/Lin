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
     * @param target: An integer
     * @return: all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        dfs(root, new ArrayList<Integer>(), target);
        return res;
    }
    List<List<Integer>> res;
    void dfs(TreeNode root, ArrayList<Integer>path, int target){
        path.add(root.val);
        target-=root.val;
        if(root.left==null &&root.right==null){
            if(target==0)
                res.add(new ArrayList<Integer>(path));
        }
        if(root.left!=null) dfs(root.left, path, target);
        if(root.right!=null) dfs(root.right, path, target);
        path.remove(path.size()-1);
    }
}