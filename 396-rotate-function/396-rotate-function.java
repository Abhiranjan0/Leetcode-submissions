class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<n; i++) {
            sum1 += nums[i];
            sum2 += nums[i]*i;
        }
        int res = sum2;
        for(int i=0; i<n; i++) {
           sum2 = sum2 - sum1 + (n)*nums[i];
           res = Math.max(res, sum2); 
        }
        return res;
    }
}