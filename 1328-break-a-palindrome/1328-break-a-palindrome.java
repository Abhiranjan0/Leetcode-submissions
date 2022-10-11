class Solution {
    public String breakPalindrome(String palindrome) {
       int m = palindrome.length();
       if(m <= 1) return "";
        char[] str = palindrome.toCharArray();
       for(int i=0; i<m/2; i++){
           if(str[i] != 'a'){
               str[i] = 'a';
               return new String(str);
           }
       } 
        str[m-1] = 'b';
            return new String(str);
    }
}