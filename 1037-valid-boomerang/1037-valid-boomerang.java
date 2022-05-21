class Solution {
    public boolean isBoomerang(int[][] points) {
        int m1 = points[0][0];
        int n1 = points[0][1];
        int m2 = points[1][0];
        int n2 = points[1][1];
        int m3 = points[2][0];
        int n3 = points[2][1];
        
        if((n2-n1) * (m3-m2) != (m2-m1) * (n3-n2)) {
            return true;
        }
        
        return false;
    }
    
}