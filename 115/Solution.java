public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if(obstacleGrid == null) return 0;
        if(obstacleGrid.length <1 ||obstacleGrid[0].length<1)return 0;
        int aSide = obstacleGrid.length;
        int bSide = obstacleGrid[0].length;
        int res[][] = new int[aSide][bSide];
        // for(int i=0;i<aSide;i++)
        // {
        //     for(int j=0;j<bSide;j++)
        //     {
        //         if(obstacleGrid[i][j]==0)continue;
        //         if(obstacleGrid[i][j]==1)res[i][j] = -1;
        //         else return -1;
        //     }
        // }
        if(obstacleGrid[0][0]==1) return 0;
        res[0][0] =1;
        for(int i=1;i<aSide;i++)
        {
            if(obstacleGrid[i][0]==1)res[i][0]=0;
            else res[i][0] = res[i-1][0];
        }
        for(int i=1;i<bSide;i++)
        {
            if(obstacleGrid[0][i]==1)res[0][i]=0;
            else res[0][i] = res[0][i-1];
        }
        
        for(int i=1;i<aSide;i++)
        {
            for(int j=1;j<bSide;j++)
            {
                if(obstacleGrid[i][j]==1)res[i][j]=0;
                else res[i][j]=res[i-1][j] + res[i][j-1];
            }
        }
        
        return res[aSide-1][bSide-1];
    }
}