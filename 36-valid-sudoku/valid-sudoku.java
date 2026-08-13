class Solution {
    public boolean isValid(char[][] board,int x,int y,char nums){

    for(int col=0;col<9;col++){
        if(board[x][col]==nums) return false;
    }

    for (int row=0;row<9;row++){
        if(board[row][y]==nums) return false;
    }

    int sRow= x/3*3;
    int sCol=y/3*3;

    for(int i=sRow;i<sRow+3;i++){
        for(int j=sCol;j<sCol+3;j++){
            if(board[i][j]==nums) return false;

        }
    }
    return true;
    }






    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;

                char num=board[i][j];
                board[i][j]='.';
                if(isValid(board,i,j,num)==false) return false;
                board[i][j]=num;

            }        
            }
            return true;
        
    }
}