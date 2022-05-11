class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        int[] nums = new int[501];
        for(int i : arr) {
            nums[i] ++;
        }
        
        for(int i=1; i<=500; i++) {
            if(nums[i] == i) {
                res = i ;           
        }
            
        }
        return res;
        
    }
}