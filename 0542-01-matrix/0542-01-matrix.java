class Solution {
    public int[][] updateMatrix(int[][] mat) {
            int n = mat.length;
        int m = mat[0].length;

        int[][] dist = new int[n][m];

        boolean[][] vis = new boolean[n][m];

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(mat[i][j] == 0) {

                    q.offer(new int[]{i, j, 0});

                    vis[i][j] = true;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!q.isEmpty()) {

            int[] curr = q.poll();

            int row = curr[0];
            int col = curr[1];
            int steps = curr[2];

            dist[row][col] = steps;

            for(int k = 0; k < 4; k++) {

                int nr = row + dr[k];
                int nc = col + dc[k];

                if(nr >= 0 &&
                   nc >= 0 &&
                   nr < n &&
                   nc < m &&
                   !vis[nr][nc]) {

                    vis[nr][nc] = true;

                    q.offer(new int[]{nr, nc, steps + 1});
                }
            }
        }

        return dist;
    }
}