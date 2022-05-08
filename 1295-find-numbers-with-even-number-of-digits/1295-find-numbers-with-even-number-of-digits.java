class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums) {
            int dig = 0;
            
            while(n>0) {
                n = n/10;
                dig ++;
            }
        if(dig % 2 == 0) {
            count++;
        }
            
        }    
        return count;
    }
}