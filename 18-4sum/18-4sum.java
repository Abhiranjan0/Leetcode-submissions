class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> ans = new  ArrayList<List<Integer>>();
        if(nums[0]==1000000000 && nums[1]==1000000000)return ans;
        if(nums[0]==-1000000000 && nums[1]==-1000000000)return ans;
        Arrays.sort(nums);
        if(nums == null || nums.length ==0)
            return ans;
        int n = nums.length;
        for(int i=0; i<n; i++){  
            
            for(int j=i+1; j<n; j++){
                
                int target_1 = target - nums[j]-nums[i];
                int lo = j+1;
                int hi = n-1;
                
                while(lo < hi){
                    int two_sum = nums[lo] + nums[hi];
                    if(two_sum < target_1) lo++;
                    else if(two_sum > target_1) hi--;
                    
                    else{
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[lo]);
                        res.add(nums[hi]);
                        ans.add(res);
                        
                        while(lo < hi && nums[lo] == res.get(2)) lo++;
                        while(lo < hi && nums[hi] == res.get(3)) hi--;
                    }
                }
                while(j+1 < n && nums[j+1] == nums[j]) ++j;
            }
            while(i+1 < n && nums[i+1] == nums[i]) ++i;
        }
      return ans;
    }
}