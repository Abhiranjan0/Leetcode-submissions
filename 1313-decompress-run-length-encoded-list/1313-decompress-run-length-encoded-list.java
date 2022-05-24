class Solution {
    public int[] decompressRLElist(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        int count  = 0;
        for(int i=0; i<nums.length; i=i+2) {
            count += nums[i];
        }
        
        int j=0;
        int[] res = new int[count];
        for(int i=0; i<nums.length; i=i+2) {
            
            for(int k=1; k<=nums[i]; k++) {
                res[j] = nums[i+1];
                j++;
            }
        }
        return res;
    }
}