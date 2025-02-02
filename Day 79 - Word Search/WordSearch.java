class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == word.charAt(0) && dfs(mat, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean dfs(char[][] mat, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] != word.charAt(index)) {
            return false;
        }
        
        char temp = mat[i][j];
        mat[i][j] = '#'; // Mark as visited
        
        int[] rowDir = {-1, 1, 0, 0};
        int[] colDir = {0, 0, -1, 1};
        
        for (int d = 0; d < 4; d++) {
            if (dfs(mat, word, i + rowDir[d], j + colDir[d], index + 1)) {
                return true;
            }
        }
        
        mat[i][j] = temp; // Backtrack
        return false;
    }
}
