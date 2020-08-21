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
    public String serialize(TreeNode root) {
        // write your code here
        if(root == null) return "{}";
        Queue<TreeNode> bfs = new LinkedList<>();
        ArrayList<TreeNode> nodes = new ArrayList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            TreeNode temp = bfs.poll();
            nodes.add(temp);
            if(temp == null) continue;
            bfs.offer(temp.left);
            bfs.offer(temp.right);
        }
        while(nodes.get(nodes.size()-1) == null)
            nodes.remove(nodes.size()-1);
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(TreeNode i: nodes){
            if(i==null) sb.append('#');
            else sb.append(i.val);
            sb.append(',');
        }
        if(sb.charAt(sb.length()-1)==',') sb.deleteCharAt(sb.length()-1);
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
        String[] vals = data.substring(1,data.length()-1).split(",");
        ArrayList<TreeNode> nodes = new ArrayList<>();
        nodes.add(new TreeNode(Integer.parseInt(vals[0])));
        int index=0;
        boolean isLeft = true;
        for(int i=1;i<vals.length;i++){
            if(!vals[i].equals("#")){
                TreeNode temp = new TreeNode(Integer.parseInt(vals[i]));
                if(isLeft){
                    nodes.get(index).left = temp;
                }
                else{
                    nodes.get(index).right = temp;
                }
                nodes.add(temp);
            }
            if(!isLeft) index++;
            isLeft = !isLeft;
        }
        return nodes.get(0);
    }
}