class Solution {
    public boolean increasingTriplet(int[] nums) {
        int m = nums.length;
        if(m < 3) 
            return false;
        
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        
        for(int i=0; i<m; i++){
            if(nums[i] <= n1)
                n1 = nums[i];
            
            else if(nums[i] <= n2)
                n2 = nums[i];
            
            else
                return true;
        }
        return false;
    }
}