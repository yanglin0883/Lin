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
     * @param root: the binary tree of the  root
     * @return: return a list of double
     */
    public List<Double> averageOfLevels(TreeNode root) {
        // write your code here
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        ArrayList<Double> res = new ArrayList<Double>();
        bfs.offer(root);
        while(!bfs.isEmpty())
        {
            int size =bfs.size();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = bfs.poll();
                if(temp.left != null) bfs.offer(temp.left);
                if(temp.right != null) bfs.offer(temp.right);
                level.add(temp.val);
            }
            res.add(average(level));
        }
        return res;
    }
    
    private Double average(ArrayList<Integer> temp)
    {
        Double res= new Double(0);
        for(Integer i : temp)
            res = res + new Double(i);
        res = res / temp.size();
        return res;
    }
}