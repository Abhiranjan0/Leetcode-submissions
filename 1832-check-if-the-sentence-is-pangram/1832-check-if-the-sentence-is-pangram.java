class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length() < 26){
            return false;
        }
        for(char i='a'; i<='z'; i++){
            if(s.indexOf(i) < 0)
                return false;
        }
        return true;
    }
}