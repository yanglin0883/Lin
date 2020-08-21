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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root == null) return;
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            TreeNode node = bfs.poll();
            if(node.left != null) bfs.offer(node.left);
            if(node.right != null)bfs.offer(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
}