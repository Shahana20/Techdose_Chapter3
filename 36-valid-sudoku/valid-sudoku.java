class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set visited = new HashSet();
        for(int i = 0 ; i < 9 ; i++)
        {
            for(int j = 0 ; j < 9 ;j++)
            {
                if(board[i][j] != '.')
                {
                    char n = board[i][j];
                    if((!visited.add(n+" in row "+i))||(!visited.add(n+"in col "+j))||(!visited.add(n+" in block "+(i/3)+" "+(j/3))))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}