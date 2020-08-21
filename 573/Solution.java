public class Solution {
    /**
     * @param grid: a 2D grid
     * @return: An integer
     */
    
    public int shortestDistance(int[][] grid) {
        // write your code here
        if(grid==null||grid.length==0||grid[0].length==0) return 0;
        setGrid(grid);
        List<Coordinate> houses = getCoordinate(HOUSE);
        int[][] distanceSum=new int[n][m];
        int[][] visitedTimes = new int[n][m];
        for(Coordinate house:houses){
            bfs(house, distanceSum, visitedTimes);
        }
        int shortest = Integer.MAX_VALUE;
        List<Coordinate> empties = getCoordinate(EMPTY);
        for(Coordinate empty : empties){
            if(visitedTimes[empty.x][empty.y] != houses.size())
                continue;
            shortest = Math.min(shortest, distanceSum[empty.x][empty.y]);
        }
        if(shortest==Integer.MAX_VALUE)
            return -1;
        return shortest;
    }
    final int WALL = 2, HOUSE=1, EMPTY=0;
    int m,n, grid[][];
    private void setGrid(int[][] grid){
        n=grid.length;
        m=grid[0].length;
        this.grid = grid;
    }
    private boolean inBound(Coordinate co){
        if(co.x<0||co.x>=n)
            return false;
        if(co.y<0||co.y>=m)
            return false;
        return grid[co.x][co.y]==EMPTY;
    }
    private List<Coordinate> getCoordinate(int val){
        List<Coordinate> res = new ArrayList<>();
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(grid[i][j]==val)res.add(new Coordinate(i,j));
        return res;
    }
    private void bfs(Coordinate start, int[][] distanceSum, int[][] visitedTimes){
        int dX[] = {0,0,1,-1};
        int dY[] = {1,-1,0,0};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean[][] hash = new boolean[n][m];
        queue.offer(start);
        hash[start.x][start.y] = true;
        int steps=0;
        while(!queue.isEmpty()){
            steps++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                Coordinate co = queue.poll();
                for(int j=0;j<4;j++){
                    Coordinate adj = new Coordinate(
                        co.x + dX[j],
                        co.y + dY[j]
                        );
                    if(!inBound(adj)) continue;
                    if(hash[adj.x][adj.y]) continue;
                    queue.offer(adj);
                    hash[adj.x][adj.y] = true;
                    distanceSum[adj.x][adj.y] += steps;
                    visitedTimes[adj.x][adj.y]++;
                }
            }
        }
    }
}

class Coordinate{
    int x,y;
    Coordinate(int a, int b){
        x=a;y=b;
    }
}