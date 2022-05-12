class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List res = new ArrayList<>();
        for(int i=0; i<matrix.length; i++) {
            
            int min = Integer.MAX_VALUE;
            int col = 0;
            for(int j=0; j<matrix[i].length; j++) {
                
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            for(int k=0; k<matrix.length; k++) {
                if(matrix[k][col] > min) {
                    break;
                }
                
                if(k == matrix.length-1) 
                    res.add(min);
            }
        }
        return res;
    }
}