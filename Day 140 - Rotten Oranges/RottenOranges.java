class Solution {
    public int orangesRotting(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0, time = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    queue.add(new int[]{i, j, 0}); 
                } else if (mat[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        int[] dRow = {-1, 1, 0, 0}; 
        int[] dCol = {0, 0, -1, 1}; 

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0], c = current[1], currTime = current[2];

            time = Math.max(time, currTime);

            for (int k = 0; k < 4; k++) {
                int newRow = r + dRow[k];
                int newCol = c + dCol[k];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && mat[newRow][newCol] == 1) {
                    mat[newRow][newCol] = 2; 
                    freshOranges--;
                    queue.add(new int[]{newRow, newCol, currTime + 1});
                }
            }
        }

        return freshOranges == 0 ? time : -1;
    }
}
