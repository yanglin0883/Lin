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
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
     
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        element(root, target,al);
        return res;
    }
    
    private void element(TreeNode root, int target,ArrayList<Integer> al)// once go through, all paths come out
    {
        if(root == null)
        {
            return ;
        }
        
   //     System.out.println(root.val+" "+target);
        //ArrayList<Integer> al= new ArrayList<Integer>();
        target -= root.val;
        al.add(root.val);//al是根节点到当前节点的总路径
        
        if(root.left == null && root.right == null) //如果当前节点是叶子节点
        {
            if(target == 0)
            {
                //res.add(al);
                ArrayList<Integer> a = new ArrayList<Integer>();
                /*for( int i=0; i<al.size(); i++ ){
                    a.add(al.get(i));
                }*/
                a.addAll(al);//放一个新的list进res，而不是跟着变的临时变量
        //        System.out.println("a="+a);
                //al = a;
                res.add(a);
            }
            else
            {
                //al.clear();
                
                
                //al.remove( al.size()-1 );
            }
        }
    //    System.out.println("al="+al);
    //    System.out.println("res="+res);
        
        if(root.left != null)
        {
            element(root.left, target,al);//每一层递归调用之后，在当前list中删掉该元素
             al.remove( al.size()-1 );
        }
        if(root.right != null)
        {
            element(root.right, target,al);
             al.remove( al.size()-1 );
        }
    }
}