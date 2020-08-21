// 0:people    1: zombie    2: wall
class Solution{
	public int zombie(int[][] grid){
		if(grid==null||grid.length==0||grid[0].length==0) return 0;
		int n = grid.length;
		int m = grid[0].length;
		int people=0;
		Queue<Pair> queue = new LinkedList<>();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++){
				if(grid[i][j]==0)people++;
				else if(grid[i][j]==1) queue.offer(new Pair(i, j));
			}
		if(people == 0) return 0;
		int day =0;
		int[] dX ={0,0,1,-1};
		int[] dY ={1,-1,0,0};
		while(!queue.isEmpty()){
			day++;
			int size = queue.size();
			for(int i=0;i<size;i++){
				Pair temp = queue.poll();
				for(int j=0;j<4;j++){
					Pair adj = new Pair(temp.x+dX[j], temp.y+dY[j]);
					if(!inBound(adj, grid)) continue;
					if(grid[adj.x][adj.y] == 0){
						grid[adj.x][adj.y] = 1;
						queue.offer(adj);
						people--;
					}
				}
			}
		}
		if(people==0) return day;
		else return -1;
	}
	private boolean inBound(Pair p, int[][] grid){
		if(p.x<0||p.y<0||p.x>=grid.length||p.y>=grid[0].length) return false;
		return true;
	}
	private class Pair{
		int x, y;
		Pair(int a, int b){
			x=a, y=b;
		}
	}
}