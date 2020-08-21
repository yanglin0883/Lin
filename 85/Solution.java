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
    /*
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(root == null) return node;
        TreeNode temp = root;
        while(true){
            if(node.val<temp.val){
                if(temp.left == null){
                    temp.left = node;
                    break;
                }
                else temp = temp.left;
            }
            else{
                if(temp.right == null){
                    temp.right = node;
                    break;
                }
                else temp = temp.right;
            }
        }
        return root;
    }
}