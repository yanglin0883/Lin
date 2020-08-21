public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix.length ==0)
            return false;
        int row, col=-1;
        row = getRow(matrix, target);
        if(row == -1) return false;
        col = getCol(matrix, row, target);
        if(col == -1)return false;
        else 
            return true;
    }
    
    private int getRow(int[][] matrix, int target){
        
        int min =0;
        int max =matrix.length-1;
        int mid = (min+max)>>1;
        while(min<= max){ 
            mid = (min+max)>>1;
            if(target> matrix[mid][0])
                min = mid + 1;
            else if(target< matrix[mid][0])
                max = mid - 1;
            else return mid;
        }
        if(target>= matrix[mid][0]) return mid;
        else if(target< matrix[mid][0]) return mid-1;
        return -1;
    }
    
    private int getCol(int[][] matrix,int row, int target){
        int min =0;
        int max =matrix[row].length-1;
        int mid = (min+max)>>1;
        while(target != matrix[row][mid]){
            if(target> matrix[row][mid])
                min = mid + 1;
            else if(target< matrix[row][mid])
                max = mid - 1;
            if(min>max) return -1;
            mid = (min+max)>>1;
        }
        return mid;
    }
}