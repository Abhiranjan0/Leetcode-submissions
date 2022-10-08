class Solution {
    public int firstMissingPositive(int[] nums) {
      int i=0;
      Arrays.sort(nums);
      HashSet<Integer> hs = new HashSet<>();
      for(int val : nums){
          hs.add(val);
      }  
        for(i=1; ; i++){
            if(!hs.contains(i))
                return i;
            }
        
    }
}