class Solution {
    public int firstUniqChar(String s) {
        
        int[] ans = new int[26];
        for(int i=0; i<s.length(); i++)
            ans[s.charAt(i) - 'a']++;
        
        for(int i=0; i<s.length(); i++){
            if(ans[s.charAt(i) - 'a'] == 1)
              return i;  
        }
        return -1;
    }
}