class Solution {
    public boolean findSubarrays(int[] nums) {
       Set<Integer> hs = new HashSet<>();
       for(int i=0; i<nums.length-1; i++){
           int cnt = nums[i] + nums[i+1];
           if(hs.contains(cnt)) return true;
           hs.add(cnt);
           
       }
        return false;
    }
}