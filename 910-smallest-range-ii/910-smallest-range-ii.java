class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[n-1]-nums[0];
        
        for(int i=0; i<n-1; i++) {
           int j = i+1; 
           int low = Math.min(nums[0]+k, nums[j]-k);
           int high = Math.max(nums[n-1]-k, nums[i]+k);
           ans = Math.min(ans, high-low); 
        }
        return ans;
    }
}