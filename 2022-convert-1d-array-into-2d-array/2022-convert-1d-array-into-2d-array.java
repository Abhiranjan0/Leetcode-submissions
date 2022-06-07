class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int n1 = original.length;
        if(n1 != m*n) return new int[0][0];
        
        int[][] ans = new int[m][n];
        for(int idx=0; idx<n1; idx++) {
           int nrow = idx/n;
           int ncol = idx%n;
            ans[nrow][ncol] = original[idx];
        }
        return ans;
    }
}