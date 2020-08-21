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
     * @param root: the root of binary tree
     * @return: the root of the minimum subtree
     */
    public TreeNode findSubtree(TreeNode root) {
        // write your code here
        int sum = dfs(root);
        if(sum<minSum)return root;
        else return res;
    }
    TreeNode res=null;
    int minSum = Integer.MAX_VALUE;
    int dfs(TreeNode root){
        if(root==null) return 0;
        int sum = root.val+dfs(root.left)+dfs(root.right);
        if(sum<minSum){
            minSum = sum;
            res = root;
        }
        //System.out.println(sum);
        return sum;
    }
}