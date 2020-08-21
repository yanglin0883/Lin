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
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if(root==null) return true;
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        int minDepth=0;
        int depth =0;
        while(!bfs.isEmpty())
        {
            int size = bfs.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = bfs.poll();
                if((temp.left == null || temp.right == null)&&minDepth==0) minDepth = depth+1;
                if(temp.left != null)bfs.offer(temp.left);
                if(temp.right != null)bfs.offer(temp.right);
            }
            depth++;
            System.out.println("min= "+minDepth+"  total= "+depth);
            if(minDepth!=0 && depth - minDepth > 1) return false;
        }
        return true;
    }
}