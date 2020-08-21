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
     * @param root: the root of the given tree
     * @return: the values of the nodes you can see ordered from top to bottom
     */
    public List<Integer> rightSideView(TreeNode root) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            TreeNode temp=root;
            for(int i=0;i<size;i++){
                temp = bfs.poll();
                if(temp.left!=null) bfs.offer(temp.left);
                if(temp.right!=null) bfs.offer(temp.right);
            }
            res.add(temp.val);
        }
        return res;
    }
}