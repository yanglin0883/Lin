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
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = queue.poll();
                level.add(temp.val);
                if(temp.left != null)
                    queue.offer(temp.left);
                if(temp.right != null)
                    queue.offer(temp.right);
            }
            result.add(level);
        }
        return result;
    }
}