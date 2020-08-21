public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    public int numIslands(boolean[][] grid) {
        // write your code here
        int count=0;
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++)
            if(grid[i][j]){
                count++;
                bfs(grid, i, j);
            }
        return count;
    }
    private void bfs(boolean[][] grid, int x, int y){
        int[] dX = {0,0,1,-1};
        int[] dY = {1,-1,0,0};
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(x, y));
        grid[x][y] = false;
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            for(int i=0;i<4;i++){
                Pair p = new Pair(temp.x+dX[i], temp.y+dY[i]);
                if(!inBound(p, grid)) continue;
                if(grid[p.x][p.y]){
                    grid[p.x][p.y] = false;
                    queue.offer(p);
                }
            }
        }
    }
    private boolean inBound(Pair p, boolean[][] grid){
        if(p.x<0||p.y<0||p.x>=grid.length||p.y>=grid[0].length) return false;
        else return true;
    }
    private class Pair{
        int x, y;
        Pair(int a, int b){
            x=a;y=b;
        }
    }
}