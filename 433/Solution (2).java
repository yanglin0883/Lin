public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    private int m,n;
    public int numIslands(boolean[][] grid) {
        // write your code here
        m=grid.length;
        if(m==0) return 0;
        n=grid[0].length;
        if(n==0) return 0;
        int res =0;
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        if(grid[i][j]){
            res++;
            dfs(grid, i, j);
        }
        return res;
    }
    
    private void dfs(boolean[][] grid, int i, int j){
        if(i<0||j<0||i>=m||j>=n||!grid[i][j]) return;
        grid[i][j] = false;
        int[] x ={0,0,1,-1};
        int[] y ={1,-1,0,0};
        for(int k=0;k<4;k++)
        dfs(grid,i+x[k], j+y[k]);
    }
}