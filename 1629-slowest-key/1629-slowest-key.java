class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char maxKey = keysPressed.charAt(0);
        
        for(int i=1; i<releaseTimes.length; i++) {
            int diff = releaseTimes[i] - releaseTimes[i-1];
            if(max < diff) {
                max = diff;
                maxKey = keysPressed.charAt(i);
            }
            else if(diff == max) {
                maxKey = (char)Math.max(maxKey, keysPressed.charAt(i));
            }   
        }
        return maxKey;
    }
}