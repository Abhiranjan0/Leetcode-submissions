class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                //Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse rows
         for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                //Swap matrix[i][j] with matrix[i][n-j-1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
             
         }    
    }
}