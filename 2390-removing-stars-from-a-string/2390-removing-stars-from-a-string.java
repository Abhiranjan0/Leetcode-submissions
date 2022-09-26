class Solution {
    public String removeStars(String s) {
       
        StringBuilder sb = new StringBuilder();
        int star = 0;
        
        for(int i=s.length()-1; i>-1; i--){
            char ch = s.charAt(i);
            if(ch == '*'){
                star++;
                continue;
            }
            
            else if(star>0){
                star--;
                continue;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
}