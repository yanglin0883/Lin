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
        return dfs(root).node;
    }
    Res dfs(TreeNode root){
        if(root==null){
            return new Res(null, 0, Integer.MAX_VALUE);
        }
        Res left = dfs(root.left);
        Res right = dfs(root.right);
        int sum = root.val;
        sum+=left.sum;
        sum+=right.sum;
        //System.out.println(root.val+" :+  "+sum);
        Res res = new Res(root, sum, sum);
        if(left.label<res.label) {
            res.node = left.node;
            res.label = left.label;
        }
        if(right.label<res.label) {
            res.node = right.node;
            res.label = right.label;
        }
        return res;
    }
    
    class Res{
        TreeNode node;int label;
        int sum;
        Res(TreeNode t, int a, int b){
            node = t; sum = a;label =b;
        }
    }
}