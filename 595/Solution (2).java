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
     * @return: the length of the longest consecutive sequence path
     */
    public int longestConsecutive(TreeNode root) {
        // write your code here
        dfs(root, root.val+1, 0);
        return max;
    }
    int max=1;
    void dfs(TreeNode root, int parentVal, int length){
        if(root==null) return;
        if(root.val == parentVal+1) {
            length++;
            max = Math.max(max, length);
        }
        else length=1;
        dfs(root.left, root.val, length);
        dfs(root.right, root.val, length);
    }
}