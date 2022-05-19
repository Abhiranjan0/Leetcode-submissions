class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if(n == 0) 
            return 0;
        
        int max = 0;
        for(int i=1; i<n; i++) {
            if(nums[max] < nums[i])
                max = i;
        }
        for(int i=0; i<n; i++) {
            if(i !=max  &&  nums[i]*2 > nums[max]) {
                return -1;
            }
        }
        return max;
    }
}