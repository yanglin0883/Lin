public class Solution {
    /**
     * @param image: a binary matrix with '0' and '1'
     * @param x: the location of one of the black pixels
     * @param y: the location of one of the black pixels
     * @return: an integer
     */
    public int minArea(char[][] image, int x, int y) {
        // write your code here
        int top= y, bottom=y, left=x, right=x;
        int[] dX={0,0,1,-1}, dY={1,-1,0,0};
        Queue<Pair> bfs = new LinkedList<>();
        bfs.offer(new Pair(x, y));
        image[x][y] = '2'; // visited
        while(!bfs.isEmpty()){
            Pair temp = bfs.poll();
            top = Math.min(top, temp.y);
            bottom = Math.max(bottom, temp.y);
            left = Math.min(left, temp.x);
            right = Math.max(right, temp.x);
            for(int i=0;i<4;i++){
                Pair adj = new Pair(temp.x+dX[i] , temp.y+dY[i]);
                if(inBound(image, adj.x, adj.y)){
                    bfs.offer(adj);
                    image[adj.x][adj.y] = '2';
                }
            }
        }
        
        return (bottom-top+1)*(right-left+1);
    }
    
    private class Pair{
        int x, y;
        Pair(int a, int b){x=a;y=b;}
    }
    private boolean inBound(char[][]image, int x, int y){
        if(x<0||y<0||x>=image.length||y>=image[0].length) return  false;
        return image[x][y] == '1';
    }
}