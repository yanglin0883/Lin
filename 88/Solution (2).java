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
     * @param root: The root of the binary search tree.
     * @param A: A TreeNode in a Binary.
     * @param B: A TreeNode in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        dfs(root, A, B);
        return res;
    }
    TreeNode res =null;
    boolean[] dfs(TreeNode root, TreeNode A, TreeNode B){
        if(res!=null||root==null) return new boolean[2];
        boolean[] left = dfs(root.left, A, B);
        boolean[] right = dfs(root.right, A, B);
        boolean[] judge = new boolean[2];
        judge[0] = left[0] || right[0]||root==A;
        judge[1] = left[1] || right[1]||root==B;
        //System.out.println(root.val+"  "+judge[0]+"  "+judge[1]);
        if(judge[0]&&judge[1]) {
            res = root;
            return new boolean[2];
        }
        return judge;
    }
}