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
     * @param root: A tree
     * @return: buttom-up level order a list of lists of integer
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = bfs.size();
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                level.add(temp.val);
                if(temp.left!= null) bfs.offer(temp.left);
                if(temp.right!= null) bfs.offer(temp.right);
            }
            res.addFirst(level);
        }
        return res;
    }
}