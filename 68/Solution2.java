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
     * @return: Postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here    
        List<Integer> al = new ArrayList<Integer>();
        if(root == null)
            return al;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode head = root;
        while(!stack.empty())
        {
            TreeNode temp = stack.peek();
        //    System.out.println(temp.val);
            if(((temp.left == null)&&(temp.right == null)) ||temp.left == head || temp.right  ==head)
            {
                al.add(new Integer(temp.val));
                stack.pop();
                head = temp;
            }
            else
            {
                if(temp.right != null)
                    stack.push(temp.right);
                if(temp.left != null)
                    stack.push(temp.left);
            }
        }
        return al;
    }
}