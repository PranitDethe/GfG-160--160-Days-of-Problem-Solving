class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return false;
        }
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = n * m - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = mat[mid / m][mid % m];
            if (midElement == x) {
                return true;
            } else if (midElement < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
