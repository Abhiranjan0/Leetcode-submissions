class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
       int x1 =coordinates[0][0], y1 = coordinates[0][1];
       int x2 = coordinates[1][0], y2 =coordinates[1][1];
       int x = x2-x1, y = y2-y1;
       
        for(int[] arr : coordinates) {
            int xcoor = arr[0], ycoor = arr[1];
            
            if(x*(ycoor-y2) != y*(xcoor-x2)) {
                return false;
            }     
        }
        return true;
    }
}