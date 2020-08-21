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
    public List<List<Integer>> binaryTreePathSum2(TreeNode root, int target) {
        // write your code here
        if(root==null) return res;
        tar = target;
        dfs( root, new LinkedList<Integer>());
        return res;
    }
    int tar;
    List<List<Integer>> res = new ArrayList<>();
    void dfs(TreeNode root, LinkedList<Integer>path){
        if(root==null) return;
        path.addFirst(root.val);
        int sum =0;
        LinkedList<Integer> temp = new LinkedList<Integer>();
        for(Integer i: path){
            sum = sum+i;
            temp.addFirst(i);
            if(sum==tar) res.add(new LinkedList<Integer>(temp));
        }
        dfs(root.left, path);
        dfs(root.right, path);
        path.removeFirst();
    }
}