class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
        
       int i=0, j=nums.length;
       int mid = nums[(j)/2] ;
       int res = 0;
        
       while(i<j) {
           res+= Math.abs(nums[i]-mid);
           i++;
       } 
        return res;
    }
}