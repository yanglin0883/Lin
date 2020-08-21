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
    public int longestConsecutive2(TreeNode root) {
        // write your code here
        if(root==null) return 0;
        dfs(root, root.val+2, 0,0);
        return max;
    }
    int max=1;
    int[] dfs(TreeNode root, int parentVal, int dLength, int uLength){
        if(root==null) return new int[2];
        int down = (root.val == parentVal+1)? dLength+1:1;
        int up = (root.val == parentVal-1)? uLength+1:1;
        int[] left = dfs(root.left, root.val, down, up);
        int[] right = dfs(root.right, root.val, down, up);
        int maxLenght=Math.max(up, down);
        if(root.left!=null){
            if(root.val==root.left.val-1)
                maxLenght = Math.max(maxLenght, down+left[0]);
            else if(root.val == root.left.val+1)
                maxLenght = Math.max(maxLenght, up+left[1]);
        }
        if(root.right!=null){
            if(root.val==root.right.val-1)
                maxLenght = Math.max(maxLenght, down+right[0]);
            else if(root.val == root.right.val+1)
                maxLenght = Math.max(maxLenght, up+right[1]);
        }
        if(root.left!=null&&root.right!=null){
            if(root.val==root.left.val+1&&root.val==root.right.val-1)
                maxLenght = Math.max(maxLenght, left[1]+1+right[0]);
            else if(root.val==root.left.val-1&&root.val==root.right.val+1)
                maxLenght = Math.max(maxLenght, left[0]+1+right[1]);
        }
        max = Math.max(max, maxLenght);
        int[] res = {1,1};
        if(root.left!=null){
            if(root.left.val==root.val+1) res[0] = Math.max(res[0], left[0]+1);
            else if(root.left.val==root.val-1) res[1] = Math.max(res[1], left[1]+1);
        }
        if(root.right!=null){
            if(root.right.val==root.val+1) res[0] = Math.max(res[0], right[0]+1);
            else if(root.right.val==root.val-1) res[1] = Math.max(res[1], right[1]+1);
        }
        return res;
    }
}