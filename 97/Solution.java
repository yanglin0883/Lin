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
     * @return: An integer
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if(root == null) return 0;
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        int max = 0;
        while(!bfs.isEmpty())
        {
            int size = bfs.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = bfs.poll();
                if(temp.left != null) bfs.offer(temp.left);
                if(temp.right != null) bfs.offer(temp.right);
            }
            max++;
        }
        return max;
    }
}