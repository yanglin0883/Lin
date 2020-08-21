/**
 * Definition of ParentTreeNode:
 * 
 * class ParentTreeNode {
 *     public ParentTreeNode parent, left, right;
 * }
 */


public class Solution {
    /*
     * @param root: The root of the tree
     * @param A: node in the tree
     * @param B: node in the tree
     * @return: The lowest common ancestor of A and B
     */
    public ParentTreeNode lowestCommonAncestorII(ParentTreeNode root, ParentTreeNode A, ParentTreeNode B) {
        // write your code here
        dfs(root, A, B);
        return res;
    }
    ParentTreeNode res =null;
    boolean[] dfs(ParentTreeNode root, ParentTreeNode A, ParentTreeNode B){
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