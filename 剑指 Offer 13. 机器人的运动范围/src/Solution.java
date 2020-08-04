class Solution {
    public int movingCount(int m, int n, int k) {
        int[][] arr = new int[m][n];
        boolean[][] visit = new boolean[m][n];
        return dfs(visit, 0, 0, 0, 0, m, n, k);
    }

    private int dfs(boolean[][] visit, int i, int j, int si, int sj, int m, int n, int k) {
        if (i >= m || j >= n || k < si + sj || visit[i][j]) {
            return 0;
        }
        visit[i][j] = true;
        return
                1 + dfs(visit, i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj, m, n, k)
                + dfs(visit, i, j + 1, si, (j + 1) % 10!= 0 ? sj + 1 : sj - 8, m, n, k);
    }

}