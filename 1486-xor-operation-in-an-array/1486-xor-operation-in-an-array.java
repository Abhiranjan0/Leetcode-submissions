class Solution {
    public int xorOperation(int n, int S) {
        int[] arr = new int[n];
        int sum = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = S + (2*i);
            sum = sum^arr[i];
        }
        return sum;
    }
}