class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while(true) {
            for(int i = l; i <= r; i++) res[x++] = matrix[t][i]; // left to right.
            if(++t > b) break;
            for(int i = t; i <= b; i++) res[x++] = matrix[i][r]; // top to bottom.
            if(l > --r) break;
            for(int i = r; i >= l; i--) res[x++] = matrix[b][i]; // right to left.
            if(t > --b) break;
            for(int i = b; i >= t; i--) res[x++] = matrix[i][l]; // bottom to top.
            if(++l > r) break;
        }
        return res;
    }
}
/*打印方向	1. 根据边界打印	2. 边界向内收缩	3. 是否打印完毕
        从左向右	左边界l ，右边界 r	上边界 t 加 11	是否 t > b
        从上向下	上边界 t ，下边界b	右边界 r 减 11	是否 l > r
        从右向左	右边界 r ，左边界l	下边界 b 减 11	是否 t > b
        从下向上	下边界 b ，上边界t	左边界 l 加 11	是否 l > r*/
