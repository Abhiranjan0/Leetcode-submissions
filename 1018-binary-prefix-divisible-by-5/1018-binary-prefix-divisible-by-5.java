class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List ans = new ArrayList<>();
        int res = 0;
        for(int a : nums) {
            res = (res*2 + a)%5;
            ans.add(res % 5 == 0);
        }
        return ans;
    }
}