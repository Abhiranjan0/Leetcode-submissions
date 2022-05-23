class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int n = candies.length;
        int[] temp = new int[n];
        temp = candies.clone();
        Arrays.sort(temp);
        
        for(int i=0; i<n; i++) {
            if(candies[i]+extraCandies >= temp[n-1]) {
                res.add(true);
            }
            else {
                res.add(false);
            }
        }
        return res;
    }
}