public class Sudoku_Solver {
    
}

class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    public boolean helper(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(i,j,board,c)){
                            board[i][j]=c;
                            if(helper(board)) return true;;
                            board[i][j]='.';
                        }
                    }
                     return false;
                }
               
            }
        }
        return true;
    }

    public boolean isValid(int row, int col, char[][] board, char c) {
        // 0,1,2 - row/3=0
        // 3,4,5 - row/3=1
        // 6,7,8 - row/3=2
        for (int i = 0; i < 9; i++) {
            // Check row
            if (board[row][i] == c)
                return false;
            // check col
            if (board[i][col] == c)
                return false;
            // check box
            if (board[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)] == c)
                return false;
        }
        return true;
    }
}
