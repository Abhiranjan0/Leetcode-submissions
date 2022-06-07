class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] S = new String[n];
        for(int i=0; i<n; i++) {
            S[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(S, (a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String str: S)
            sb.append(str);
        
        String res = sb.toString();
        return res.startsWith("0") ? "0" : res;
    }
}