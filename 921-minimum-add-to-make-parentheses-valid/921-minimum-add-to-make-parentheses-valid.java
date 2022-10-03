class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Boolean> stk = new Stack<>();
       int n = s.length();
       for(int i=0; i<n; i++){
           char ch = s.charAt(i);
           
           if(ch == '(') stk.push(true);
           else if(ch == ')' && stk.size() > 0 && stk.peek())
               stk.pop();
           else stk.push(false);
       } 
        return stk.size();
    }
}