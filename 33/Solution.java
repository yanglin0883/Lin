public class Solution {
    /*
     * @param n: The number of queens
     * @return: All distinct solutions
     */
    private void search(List<List<String>>res,
                        ArrayList<Integer> cols,
                        int n){
        if(cols.size()==n){
            res.add(drawChessBoard(cols));
            return;
        }
        for(int colIndex=0;colIndex<n;colIndex++){
            if(!isValid(cols, colIndex)){
                continue;
            }
            cols.add(colIndex);
            search(res, cols, n);
            cols.remove(cols.size()-1);
        }
    }
    
    private ArrayList<String> drawChessBoard(ArrayList<Integer>cols){
        ArrayList<String> chessboard = new ArrayList<>();
        for(int i=0;i<cols.size();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<cols.size();j++)
                sb.append((j==cols.get(i))?'Q':'.');
            chessboard.add(sb.toString());
        }
        return chessboard;
    }
    
    private boolean isValid(ArrayList<Integer>cols, int column){
        int row = cols.size();
        for(int rowIndex=0;rowIndex<cols.size();rowIndex++){
            if(cols.get(rowIndex)==column) return false;
            if(rowIndex + cols.get(rowIndex) == row+column) return false;
            if(rowIndex - cols.get(rowIndex) == row-column) return false;
        }
        return true;
    }
    
    public List<List<String>> solveNQueens(int n) {
        // write your code InheritableThreadLocal
        List<List<String>> res =new ArrayList<>();
        if(n<=0) return res;
        search(res, new ArrayList<Integer>(), n);
        return res;
    }
}