class Solution {
    public int maximumDifference(int[] nums) {
       int n = nums.length;
       int min = Integer.MAX_VALUE;
       int max = 0;
        
       for(int i=0; i<n; i++) {    
          max = Math.max(max, nums[i]-min);
          min = Math.min(min, nums[i]);
       }
        if(max == 0) {
            return -1;
     }
    return max;
}
    
}    