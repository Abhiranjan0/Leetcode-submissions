class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[n-1];
        
        return findGCD(min, max);
    }
    
    public static int findGCD(int min, int max) {
       if(max == 0) {
           return min;
       } 
       return findGCD(max, min % max); 
    }
}