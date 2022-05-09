class Solution {
    public int sumOfUnique(int[] nums) {
       int sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        if(nums.length == 1) {
            return nums[0];
        }
        
        if(nums[0] != nums[1]) {
            sum += nums[0];
        }
        
        if(nums[nums.length-1] != nums[nums.length-2]) {
            sum += nums[nums.length-1];
        }
        
        for(int i=1; i<n-1; i++) {
           if((nums[i] != nums[i-1]) && (nums[i] != nums[i+1])) {
            sum += nums[i];
        } 
            
        }
        return sum;
    }
}