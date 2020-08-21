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
     * @param a: the root of binary tree a.
     * @param b: the root of binary tree b.
     * @return: true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // write your code here
        if(a==null)
            if(b==null) return true;
            else return false;
        if(b==null) return false;
        Queue<TreeNode> abfs = new LinkedList<TreeNode>();
        Queue<TreeNode> bbfs = new LinkedList<TreeNode>();
        abfs.offer(a);
        bbfs.offer(b);
        while(!abfs.isEmpty()){
            TreeNode tempa = abfs.poll();
            TreeNode tempb = bbfs.poll();
            if(tempa.val != tempb.val) return false;
            if(tempa.left!=null){
                if(tempb.left==null) return false;
                abfs.offer(tempa.left);
                bbfs.offer(tempb.left);
            }
            else{
                if(tempb.left!=null) return false;
            }
            if(tempa.right!=null){
                if(tempb.right==null) return false;
                abfs.offer(tempa.right);
                bbfs.offer(tempb.right);
            }
            else{
                if(tempb.right!=null) return false;
            }
        }
        return true;
    }
}