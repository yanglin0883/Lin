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
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> al = new ArrayList<Integer>();
        if(root == null)
            return al;
        Stack<TreeNode> temp = new Stack<TreeNode>();
        temp.push(root);
        while(!temp.empty())
        {
    //        System.out.println("Begin");
            TreeNode node = temp.pop();
    //        System.out.println(node.val);
            al.add(new Integer(node.val));
            if(node.right != null)
            {
                temp.push(node.right);
     //           System.out.println("right "+node.right.val);
            }
            if(node.left != null)
            {
                temp.push(node.left);
      //          System.out.println("left "+node.left.val);
            }
        }
        return al;
    }
}