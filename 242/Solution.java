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
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param root the root of binary tree
     * @return a lists of linked list
     */
    public List<ListNode> binaryTreeToLists(TreeNode root) {
        // Write your code here
        ArrayList<ListNode> res = new ArrayList<ListNode>();
        if(root==null) return res;
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            ListNode r = new ListNode(0);
            ListNode temp=r;
            for(int i=0;i<size;i++){
                TreeNode node = bfs.poll();
                // System.out.println(node.val+"");
                temp.next = new ListNode(node.val);
                temp= temp.next;
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null) bfs.offer(node.right);
            }
            res.add(r.next);
            // System.out.println(res);
        }
        return res;
    }
}