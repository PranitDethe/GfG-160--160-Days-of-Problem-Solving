class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        
        for (int i = 0; i < row; i++) {
            int left = 0, right = col - 1;
            
            while (left <= right) {
                int mid = (left + right) / 2;
                if (mat[i][mid] == x) {
                    return true;
                } else if (x < mat[i][mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}
