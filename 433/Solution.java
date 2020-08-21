public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    public int numIslands(boolean[][] grid) {
        // write your code here
        if(grid == null ||grid.length<1||grid[0].length<1) return 0;
        int col =grid[0].length;
        int row = grid.length;
        boolean[][] map = new boolean[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                map[i][j] = grid[i][j];
            }
        }
        
        int count = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                
                if(map[i][j])
                {
        //            System.out.println("i= "+i+" j= "+j);
                    dfs(map, i, j);//染色i，j附近所有联通的陆地
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs(boolean[][] map, int i, int j)
    {
        if(!inBound(map,i,j))
            return;
        if(map[i][j] == false)
            return;
        map[i][j] = false;
    //    System.out.println("i= "+i+" j= "+j);
        dfs(map, i+1, j);
        dfs(map, i-1, j);
        dfs(map, i, j+1);
        dfs(map, i, j-1);
    }
    
    private boolean inBound(boolean[][] map, int i, int j)
    {
        if(i>=0 && i<map.length && j>=0 &&j<map[0].length) return true;
        return false;
    }
}