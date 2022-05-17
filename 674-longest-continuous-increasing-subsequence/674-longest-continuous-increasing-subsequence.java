class Solution {
    public int findLengthOfLCIS(int[] nums) {
       int n = nums.length;
       int res = 1, max = 1;
        
       for(int i=1; i<n; i++) {
          if(nums[i] > nums[i-1]) 
              max ++;
           else  {
               res=Math.max(max, res);
               max = 1;
            
           }
            
       } 
        return Math.max(max,res);
    }
}