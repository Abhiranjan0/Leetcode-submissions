class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int idx = -1, count=0;
        for(int i=nums.length-1; i>=0; i--) {
            
            while(i>0 && nums[i]==nums[i-1])
                i-- ;
                count++;
            
            if(count == 3) {
                idx = i;
                break;
            }
        }
        return count<3 ? nums[nums.length-1] : nums[idx];
    }
}