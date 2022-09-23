class Solution {
    public void setZeroes(int[][] matrix) {
        
        ArrayList<Integer> m = new ArrayList<Integer>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    m.add(i);
                    n.add(j);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(m.contains(i) || n.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}