class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] safeZone = new boolean[n][n];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {

                if (board[row][col] == 1) {
                    int rowStart = (row > 0) ? row - 1 : 0;
                    int rowEnd = (row < n - 1) ? row + 1 : n - 1;
                    int colStart = (col > 0) ? col - 1 : 0;
                    int colEnd = (col < n - 1) ? col + 1 : n - 1;
                    for (int r = rowStart; r <= rowEnd; r++) {
                        for (int c = colStart; c <= colEnd; c++) {
                            safeZone[r][c] = true;
                        }
                    }
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!safeZone[i][j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}