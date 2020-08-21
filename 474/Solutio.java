/**
 * Definition of ParentTreeNode:
 * 
 * class ParentTreeNode {
 *     public ParentTreeNode parent, left, right;
 * }
 */


public class Solution {
    /*
     * @param root: The root of the tree
     * @param A: node in the tree
     * @param B: node in the tree
     * @return: The lowest common ancestor of A and B
     */
    public ParentTreeNode lowestCommonAncestorII(ParentTreeNode root, ParentTreeNode A, ParentTreeNode B) {
        // write your code here
        if(root ==null) return null;
        List<ParentTreeNode> aParent = new ArrayList<ParentTreeNode>();
        for(ParentTreeNode i = A;i.parent != null; i= i.parent)
        {
            aParent.add(i);
        }
        for(ParentTreeNode i = B;i.parent != null; i= i.parent)
        {
            if(aParent.contains(i)) return i;
        }
        return root;
    }
}