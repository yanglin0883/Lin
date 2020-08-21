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
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
        if(root!=null)bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            ArrayList<Integer> temp  = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = bfs.poll();
                temp.add(node.val);
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null) bfs.offer(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}