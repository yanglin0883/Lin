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
     * @param root: the root of the binary tree
     * @param level: the depth of the target level
     * @return: An integer
     */
    public int levelSum(TreeNode root, int level) {
        // write your code here
        if(root == null) return 0;
        int sum =0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int lvl=1;
        while(!queue.isEmpty() && lvl<=level)
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
                if(lvl == level) sum+= temp.val;
            }
            lvl++;
            
        }
        return sum;
    }
}
