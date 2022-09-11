class Solution {
    public int scoreOfParentheses(String s) {
       
        Stack<Integer> stk = new Stack<>();
        int count = 0;
        
        for(int i=0; i<s.length(); i++) {
            
            char ch = s.charAt(i);
            
            if(ch == '(') {
                
                stk.push(count);
                count = 0;
            }
            
            else{
                count = stk.pop() + Math.max(2*count,1);
            }
        }
        return count;
    }
}