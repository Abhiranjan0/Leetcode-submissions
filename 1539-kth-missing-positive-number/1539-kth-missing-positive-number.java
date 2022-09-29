class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n = arr.length;
        int lo = 0, hi = n-1;
        int missing = compute(arr[n-1], n);
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
             missing = compute(arr[mid], mid+1);
            
            if(missing >= k) hi = mid-1;
            else lo=mid+1;
        }
        if(hi == -1)
            return k;
        return arr[hi] + k-compute(arr[hi] , hi+1);
    }
    
    int compute(int actual, int expected){
        return actual-expected;
    }
}