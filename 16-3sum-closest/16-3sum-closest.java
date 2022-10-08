class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
        int ans = 0;
      int min = Integer.MAX_VALUE;
      for(int i=0; i<nums.length; i++){
          int j = i+1;
          int k = nums.length-1;
          
          while(j < k){
             int sum = nums[i] + nums[j] + nums[k];
              if(sum > target) k--;
              else j++;
              
              if(Math.abs(target - sum) < min){
                  min = Math.abs(target-sum);
                  ans = sum;
              }
          }
      } 
        return ans;
    }
}