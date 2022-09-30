class Solution {
    public int countGoodNumbers(long n) {
        int MOD = 1_000_000_007;
        long res = n%2 == 0 ? 1 : 5;
        long x = 20;
        
        for(long i=n/2; i>0; i/=2){
            if(i%2 != 0) res = res * x % MOD;
            x = x * x % MOD;
        }
        return (int) res;
    }
}