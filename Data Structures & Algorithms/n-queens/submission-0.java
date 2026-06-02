class Solution {
    List<List<String>> result=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        backtrack(n,0,board);
        return result;
    }
    public boolean isSafe(int row,int col,int n,char[][] board)
    {
        //check columns
        int i=row,j=col;
        while(i>=0)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
            i--;
        }
        //traversing upper left
        i=row;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public void backtrack(int n,int row,char[][] board)
    {
        if(row==n)
        {
            List<String> solution=new ArrayList<>();
            for(char[] r:board)
            {
                solution.add(new String(r));
            }
            result.add(solution);
            return;
        }
        for(int col=0;col<n;col++)
        {
            if(isSafe(row,col,n,board))
            {
                board[row][col]='Q';
                backtrack(n,row+1,board);
                board[row][col]='.';
            }
        }
    }
}
