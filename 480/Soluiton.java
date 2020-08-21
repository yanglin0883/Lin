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
        List<String> res = new ArrayList<String>();
        if(root==null) return res;
        StringBuilder path = new StringBuilder();
        dfs(res, path, root);
        return res;
    }
    
    private void dfs(List<String> res, StringBuilder path, TreeNode root){
        path.append("->");
        path.append(root.val);
        
        if(root.left==null&&root.right==null){
            // System.out.println("final: "+path.toString());
            if(path.length()>1&&path.charAt(1)=='>')path.delete(0,2);
            System.out.println("final: "+path.toString());
            res.add(path.toString());
            // return;
        }
        
        if(root.left!=null) dfs(res, path, root.left);
        if(root.right!=null)dfs(res, path, root.right);
        System.out.println("test: "+path.toString());
        if(path.length()>=1){
            for(int i=path.length()-1;path.length()>2&&path.charAt(i)!='>';i--){
                path.deleteCharAt(i);
                // System.out.println(path.toString());
            }
            path.delete(path.length()-2,path.length());
            
        }
        System.out.println(path.toString());
    }
}