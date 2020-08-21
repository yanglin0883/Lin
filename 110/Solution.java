public class Solution {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        int aSide = grid[0].length;
        int bSide = grid.length;
        if(aSide<1 || bSide<1) return 0;
        if(aSide == 1 && bSide == 1) return grid[0][0];
        int[][] res = new int[bSide][aSide];
        
        res[0][0] = grid[0][0];
        for(int j=1;j<bSide;j++)
        {
            res[j][0] = res[j-1][0] + grid[j][0];
        }
        for(int i=1;i<aSide;i++)
        {
            res[0][i] = res[0][i-1] + grid[0][i];
        }
        
        for(int i=1;i<aSide;i++)
        {
            for(int j=1;j<bSide;j++)
            {
                res[j][i]= grid[j][i] + min(res[j-1][i],res[j][i-1]);
            }
        }
        return res[bSide-1][aSide-1];
    }
    
    private int min(int a, int b)
    {
        return (a<b)?a:b;
    }
}