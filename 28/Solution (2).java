public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        int left=0, right=matrix.length, mid=0;
        int line=0;
        while(left<right){
            mid = left+(right-left>>1);
            if(matrix[mid][0]==target) return true;
            else if(matrix[mid][0]<target){
                if(mid == matrix.length-1 || matrix[mid+1][0]>target){
                    line = mid;
                    break;
                }
                else left = mid+1;
            }
            else right = mid;
        }
        left =0;right=matrix[line].length;
        while(left<right){
            mid = left+(right-left>>1);
            if(matrix[line][mid]==target) return true;
            else if(matrix[line][mid]<target) left = mid+1;
            else right = mid;
        }
        return false;
    }
}