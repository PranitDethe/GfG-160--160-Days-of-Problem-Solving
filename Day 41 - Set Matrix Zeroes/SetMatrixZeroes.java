class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        boolean col = false;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    if (j == 0) {
                        col = true;
                    } else {
                        mat[i][0] = 0;
                        mat[0][j] = 0;
                    }
                }
            }
        }
        for(int i = 1; i < n;i++) {
            for(int j = 1; j < m; j++) {
                if(mat[i][0] == 0 || mat[0][j] == 0) mat[i][j] = 0;
            }
        }
        if (mat[0][0] == 0) {
            for (int j = 0; j < m; j++) mat[0][j] = 0;
        }
        if(col == true) {
            for (int i = 0; i < n; i++) mat[i][0] = 0;
        }
    }
}
