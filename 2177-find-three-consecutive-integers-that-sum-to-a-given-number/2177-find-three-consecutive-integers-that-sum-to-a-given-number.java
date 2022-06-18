class Solution {
    public long[] sumOfThree(long num) {
    /*    long[] ans = new long[3];
        
        if(num%3 == 0) {
            ans[1] = num/3;
            ans[0] = (num/3)-1;
            ans[2] = (num/3)+1;
        }
        else {
            ans = new long[0];
        }
        return ans;
    */
        
        
        //Approach 2
        if(num%3 != 0) return new long[0];
        
        long ans = (num/3)-1;
        return new long[]  {ans, ans+1, ans+2};
        
    }
}