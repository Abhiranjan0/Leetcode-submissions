class Solution {
    public int maxProduct(int[] nums) {
       int n = nums.length;
       int max = 0;
       int prod = 1;
       
       for(int i=0; i<n; i++) {
           for(int j=0; j<n; j++) {
               if(i == j) {
                   break;
               }
               
               else {
                   prod = ((nums[i]-1) * (nums[j]-1));
                   if(prod > max) {
                       max = prod;
                   }
               }
           }
       } 
        return max;
    }
}