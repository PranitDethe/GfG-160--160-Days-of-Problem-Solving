class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int oldColor = image[sr][sc];
        if(oldColor == newColor) return image;
        
        dfs(image, sr, sc, oldColor, newColor);
        return image;
    }
    
    private void dfs(int[][] image, int x, int y, int oldColor, int newColor) {
        int n = image.length, m = image[0].length;
        
        if (x < 0 || y < 0 || x >= n || y >= m || image[x][y] != oldColor) {
            return;
        }
        image[x][y] = newColor;
        
        dfs(image, x + 1, y, oldColor, newColor);
        dfs(image, x - 1, y, oldColor, newColor);
        dfs(image, x, y + 1, oldColor, newColor);
        dfs(image, x, y - 1, oldColor, newColor);
    }
}
