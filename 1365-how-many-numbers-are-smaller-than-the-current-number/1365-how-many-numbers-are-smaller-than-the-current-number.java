class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
       int k = 0;
       int n = nums.length;
       int[] res = new int[n]; 
        
       for(int i=0; i<n; i++) {
           int count = 0;
           
           for(int j=0; j<n; j++) {
               if(nums[i] > nums[j]) {
                  count ++; 
               }
           }
           res[k] = count;
           k++;
       } 
        
        return res;
        
    }
}