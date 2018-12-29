class Solution {
    public int projectionArea(int[][] grid) {
        int area = 0;
        int maxC[] = new int[grid[0].length];
        for (int i=0; i<maxC.length; i++) {
            maxC[i] = grid[0][i];
        }
        
        for (int i=0; i<grid.length; i++) {
            int count = 0;//xy planes
            int maxR = grid[i][0];//xz planes
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
                if (grid[i][j] > maxR) {
                    maxR = grid[i][j];
                }
                if (maxC[j] < grid[i][j]) {
                    maxC[j] = grid[i][j];
                } 
            }
            area += (grid[i].length-count+maxR);
        }
        
        for (int i=0; i<maxC.length; i++) {
            area += maxC[i];
        }
        return area;
    }
}

