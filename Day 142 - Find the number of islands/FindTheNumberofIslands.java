class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'L' && !visited[i][j]) {
                    dfs(grid, visited, i, j, n, m);
                    count++;
                }
            }
        }
        return count;
    }
    private final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    
    private void dfs(char[][] grid, boolean [][] visited, int i, int j, int n, int m) {
        visited[i][j] = true;
        
        for(int dir = 0; dir < 8; dir++) {
            int newRow = i + dx[dir];
            int newCol = j + dy[dir];
            
            if (isSafe(newRow, newCol, n, m) && grid[newRow][newCol] == 'L' && !visited[newRow][newCol]) {
                dfs(grid, visited, newRow, newCol, n, m);
            }
        }
    }
    private boolean isSafe(int i, int j, int n, int m) {
        return (i >= 0 && j >= 0 && i < n && j < m);
    }
}
