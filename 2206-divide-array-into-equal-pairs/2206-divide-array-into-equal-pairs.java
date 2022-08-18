class Solution {
    public boolean divideArray(int[] nums) {
       int pairs = nums.length/2;
       Arrays.sort(nums);
       int count = 0; 
       
       for(int i=1; i<nums.length; i+=2) {
           if(nums[i] == nums[i-1])
               count ++;
           
       } 
         if(pairs == count) return true;
           else
               return false;
    }
}