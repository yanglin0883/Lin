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
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    TreeNode tree;
    public String serialize(TreeNode root) {
        // write your code here
        if(root == null) return "{}";
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = queue.poll();
                if(temp == null)
                {
                    sb.append("#,");
                    continue;
                }
                sb.append(temp.val+",");
                queue.offer(temp.left);
                queue.offer(temp.right);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("}");
        return sb.toString();
    }
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        if(data.equals("{}")) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        String[] values = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);
        for (int i = 1; i < values.length; i++) {
            TreeNode node = queue.poll();
            if (!values[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                node.left = left;
                queue.offer(left);
            }
            i++;
            if (!values[i].equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                node.right = right;
                queue.offer(right);
            }
        }
        return root;
    }
}