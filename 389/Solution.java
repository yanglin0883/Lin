public class Solution {
    /**
     * @param board: the board
     * @return: whether the Sudoku is valid
     */
    public boolean isValidSudoku(char[][] board) {
        // write your code here
        if(board == null || board.length !=9||board[0].length!=9) return false;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.')continue;
                for(int k=0;k<9;k++){
                    if(k==i)continue;
                    if(board[k][j] == '.')continue;
                    if(board[i][j] ==board[k][j]) return false;
                }
                for(int k=0;k<9;k++){
                    if(k==j)continue;
                    if(board[i][k] == '.')continue;
                    if(board[i][j] ==board[i][k]) return false;
                }
            }
        }
        for(int i=0;i<7;i+=3){
            for(int j=0;j<7;j+=3){
                ArrayList<Character> nums =new ArrayList<Character>();
                for(int a=0;a<3;a++){
                    for(int b=0;b<3;b++){
                        char temp = board[i+a][j+b];
                        if(temp == '.') continue;
                        if(nums.contains(temp)) return false;
                        nums.add(temp);
                    }   
                }
            }
        }
        return true;
    }
}