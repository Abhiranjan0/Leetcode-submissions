class Solution {
    public int firstMissingPositive(int[] nums) {
       int misVal = 1;
       Arrays.sort(nums);
       for(int i=0; i<nums.length; i++){
           if(nums[i] > misVal)
               return misVal;
           if(nums[i] == misVal)
               misVal++;
       } 
        return misVal;
    }
}