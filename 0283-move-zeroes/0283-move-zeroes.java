class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
       int zeroes = 0;
        int curr;
       for(int i=0; i<n; i++){
           if(nums[i] != 0){
              curr = nums[i];
              nums[i] = nums[zeroes];
              nums[zeroes] = curr;
              zeroes++;
           }
       }
       }
       
    }  
