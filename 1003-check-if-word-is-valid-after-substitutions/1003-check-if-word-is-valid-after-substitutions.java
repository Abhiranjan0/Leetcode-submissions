class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> stk = new Stack<>();
        char[] res = s.toCharArray();
        
        for(int i=0; i<res.length; i++){
            if(res[i] == 'c'){
                if(stk.size() >= 2 && stk.pop()=='b' && stk.pop()=='a'){
                    
                }
                else{
                    return false;
                }
            }
            else{
                stk.push(res[i]);
            }
        }
        return stk.size()==0;
    }
}