class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
        
    //product in case of +ve number
       int prod1 = nums[n-1] * nums[n-2] * nums[n-3];
        
    // product in case of -ve number
       int prod2 = nums[0]*nums[1]*nums[n-1]; 
        
       int maxprod = Math.max(prod1, prod2);
       return maxprod; 
    }
}