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
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        List<String> res = new ArrayList<>();
        if(root==null) return res;
        dfs(root, new ArrayList<Integer>(), res);
        return res;
    }
    void dfs(TreeNode root, ArrayList<Integer>path, List<String>res){
        path.add(root.val);
        if(root.left==null&&root.right==null){
            res.add(getString(path));
            //System.out.println(path);
            path.remove(path.size()-1);
            return;
        }
        if(root.left!=null){
            dfs(root.left, path, res);
        }
        if(root.right!=null){
            dfs(root.right, path, res);
        }
        path.remove(path.size()-1);
    }
    String getString(ArrayList<Integer>path){
        StringBuilder sb = new StringBuilder();
        for(Integer i: path){
            sb.append(i.toString());
            sb.append("->");
        }
        sb.delete(sb.length()-2, sb.length());
        return sb.toString();
    }
}