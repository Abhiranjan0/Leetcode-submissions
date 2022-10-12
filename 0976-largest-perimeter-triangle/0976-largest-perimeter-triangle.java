class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0; i<nums.length-2; i++){
            int n1 = nums[i], n2 = nums[i+1], n3 = nums[i+2];
            if(n1+n2>n3 && n2+n3>n1 && n3+n1>n2)
                ans = n1+n2+n3;
            
        }
        return ans;
    }
}