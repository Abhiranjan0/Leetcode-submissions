class Solution {
    public String firstPalindrome(String[] words) {
        String str = "";
        for(int i=0; i<words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            str = sb.toString();
            if(str.equals(words[i])){
                return str;
            }
        }
        return "";
    }
}