class Solution {
    boolean isFound = false;
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtrack(int row, int col, int pos, char[][] board, String word) {
        //Is Solution found
        if (pos == word.length()) {
            return true;
        }
        // Verify valid case
        if (row < 0 || row>=board.length || col < 0 || col>=board[0].length || board[row][col] != word.charAt(pos)) {
            return false;
        }
        // EXPLORE
        char temp = board[row][col];
        board[row][col]='#';
        boolean isFound = backtrack(row + 1, col, pos + 1, board, word)
            || backtrack(row, col + 1, pos + 1, board, word)
            || backtrack(row - 1, col, pos + 1, board, word)
            || backtrack(row, col - 1, pos + 1, board, word);
        board[row][col] = temp;
        // UNDO
        return isFound;
    }
}
