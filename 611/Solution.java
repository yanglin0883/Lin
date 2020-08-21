class Solution{
	int n, m;
	int[] dX={1,1,2,2,-1,-1,-2,-2};
	int[] dY={2,-2,1,-1,2,-2,1,-1};
	public int shortestPath(boolean[][] grid, Point source, Point destination){
		if(grid == null ||grid.length ==0 || grid[0].length == 0) return -1;
		n=grid.length;
		m=grid[0].length;
		Queue<Point> queue = new LInkedList<>();
		Set<Point> hs = new HashSet<>();
		queue.offer(soutce);
		hs.add(source):
		int steps=0;
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int i=0;i<size;i++){
				Point piont = queue.poll();
				if(point.x == destination.x && point.y == destination.y)
					return steps;
				for(int j=0;j<8;j++){
					Point temp = new Point(point.x+dX[j], point.y+dY[j]);
					if(accessible(temp, grid)&&!hs.contains(temp)){
						queue.offer(temp);
						hs.add(temp);
					}
				}
			}
			steps++;
		}
		return -1;
	}
	boolean accessible(Point temp, boolean[][] grid){
		return (temp.x>=0&&temp.y>=0&&temp.x<grid.length&&temp.y<grid[0].length&&grid[temp.x][temp.y]) ;
	}
}