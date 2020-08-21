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
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> res  = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        boolean toRight = true;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            LinkedList<Integer> level = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                if(toRight) level.add(temp.val);
                else level.addFirst(temp.val);
                if(temp.left!=null) bfs.offer(temp.left);
                if(temp.right!=null) bfs.offer(temp.right);
            }
            res.add(level);
            toRight = !toRight;
        }
        return res;
    }
}