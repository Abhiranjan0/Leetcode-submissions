class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n1 = -1, n2 = -1, count1 = 0, count2 = 0, n = nums.length;
        
       for(int i=0; i<n; i++) {
         if(nums[i] == n1)
             count1++;
           
          else if(nums[i] == n2) 
              count2++;
           
           else if(count1 == 0) {
               n1 = nums[i];
               count1 = 1;
           }
           
           else if(count2 == 0) {
               n2 = nums[i];
               count2 = 1;
           }
           else {
               count1--;
               count2--;
           }
       }
        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        
        for(int i=0; i<n; i++) {
            if(nums[i] == n1)
                count1++;
            
            else if(nums[i] == n2)
                count2++;
        }
        if(count1 > n/3) 
            ans.add(n1);
        
        if(count2 > n/3)
            ans.add(n2);
        
        return ans;
    }
}