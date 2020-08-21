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
     * @return: the root of the maximum average of subtree
     */
    public TreeNode findSubtree2(TreeNode root) {
        // write your code here
        dfs(root);
        return res;
    }
    TreeNode res=null;
    double resAve=Double.MIN_VALUE;
    Res dfs(TreeNode root){
        if(root==null) return new Res();
        Res left = dfs(root.left);
        Res right = dfs(root.right);
        Res cur = new Res();
        cur.n = left.n+right.n+1;
        // System.out.println("  "+left.n+"  "+left.ave);
        // System.out.println("  "+right.n+"  "+right.ave);
        cur.ave = (left.ave*left.n+right.ave*right.n+root.val)/cur.n;
        // System.out.println(cur.n+"  "+cur.ave);
        if(res==null||cur.ave>resAve){
            res = root;
            resAve = cur.ave;
        }
        return cur;
    }
    class Res{
        int n=0;
        double ave=0;
        //TreeNode node= null;
    }
}