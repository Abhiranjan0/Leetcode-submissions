class Solution {
    public int singleNumber(int[] nums) {
       int res = 0;
       for(int val : nums){
           res = res ^ val;
       } 
        return res;
    }
}