class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length * mat[0].length) {
            return mat;
        }
        
        int[][] mat2 = new int[r][c];
        int i=0, j=0;
        
        for(int p=0; p<r; p++) {
            for(int q=0; q<c; q++) {
                if(j == mat[0].length) {
                    i++;
                    j=0;
                }
                mat2[p][q] = mat[i][j];
                j++;
            }
        }
        return mat2;
    }
}