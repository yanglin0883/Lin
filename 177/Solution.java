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
     * @param A: an integer array
     * @return: A tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        return sortedATBST(A, 0, A.length);
    }
    
    private TreeNode sortedATBST(int[] A, int start, int end){
        if(start>= end) return null;
        int mid = (start+end-1)/2;
        TreeNode res = new TreeNode(A[mid]);
        res.left= sortedATBST(A, start, mid);
        res.right=sortedATBST(A, mid+1, end);
        return res;
    }
}