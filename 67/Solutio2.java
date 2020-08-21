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
     * @return: Inorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(root == null)
            return al;
        Stack<TreeNode> temp = new Stack<TreeNode>();
        TreeNode curt = root;
        while(curt!=null||!temp.empty())
        {
    //        System.out.println(al);
            while(curt != null)
            {
                temp.push(curt);
                curt = curt.left;
            }
            curt = temp.pop();
            al.add(new Integer(curt.val));
            curt = curt.right;
        }
        
        return al;
    }
}