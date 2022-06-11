class Solution {
    public int missingNumber(int[] nums) {
        int sumArr = 0;
        for(int i : nums ) {
            sumArr += i;
        }
        int n = nums.length;
        int sumAll = n * (n + 1)/2;
        return sumAll-sumArr;
    }
}