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
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */


public class BSTIterator {
    /*
    * @param root: The root of binary tree.
    */
    ArrayList<TreeNode> nodes = new ArrayList<>();
    Iterator<TreeNode> it;
    public BSTIterator(TreeNode root) {
        // do intialization if necessary
        dfs(root);
        it = nodes.iterator();
    }
    void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        nodes.add(root);
        dfs(root.right);
    }

    /*
     * @return: True if there has next node, or false
     */
    public boolean hasNext() {
        // write your code here
        return it.hasNext();
    }

    /*
     * @return: return next node
     */
    public TreeNode next() {
        // write your code here
        return it.next();
    }
}