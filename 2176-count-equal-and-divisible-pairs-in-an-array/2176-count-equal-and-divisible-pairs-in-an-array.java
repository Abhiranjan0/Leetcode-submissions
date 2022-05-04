class Solution {
    public int countPairs(int[] nums, int k) {
    if(nums.length == 0) {
        return 0;
    }
        int j,i=0;
        int n = nums.length, count=0;
        while(i < n) {
            j = i+1;
            
            while(j < n) {
                if(nums[i] == nums[j] && (i*j) % k == 0) {
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
}
}