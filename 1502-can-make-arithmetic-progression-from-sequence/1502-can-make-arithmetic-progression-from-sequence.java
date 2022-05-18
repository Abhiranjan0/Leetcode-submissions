class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
       Arrays.sort(arr);
       int n = arr.length;
       int count = 0;
       int diff = arr[1] - arr[0];
        
       for(int i=0; i<n-1; i++) {
           int currdiff = arr[i+1] - arr[i]; 
           if(diff == currdiff) {
               count = 1;
           }
           else {
               count = 0;
               break;
           }
       } 
        if(count == 1)
            return true;
        else 
            return false;
    }
}