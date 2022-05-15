class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = nums[0];
        
        for(int i=1; i<n; i++) {
            if(nums[i] > nums[i-1]) {
                sum += nums[i];
            }
            
            else {
                sum = nums[i];
            }
            
            max = Math.max(max, sum);
        }
        return max;
    }
}