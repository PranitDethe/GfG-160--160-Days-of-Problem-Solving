class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int[] queens = new int[n];
        solveNQueens(0, n, queens, result);
        return result;
    }
    private void solveNQueens(int col, int n, int[] queens, ArrayList<ArrayList<Integer>> result) {
        if (col == n) {
            ArrayList<Integer> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(queens[i] + 1);
            }
            result.add(solution);
            return;
        }
        for (int row = 0; row < n; row++) {
            if(isSafe(row, col, queens)) {
                queens[col] = row;
                solveNQueens(col + 1, n, queens, result);
            }
        }
    }
    private boolean isSafe(int row, int col, int[] queens) {
        for(int prevCol = 0; prevCol < col; prevCol++) {
            int prevRow = queens[prevCol];
            if(prevRow == row || Math.abs(prevRow - row) == Math.abs(prevCol - col)) {
                return false;
            }
        }
        return true;
    }
}
