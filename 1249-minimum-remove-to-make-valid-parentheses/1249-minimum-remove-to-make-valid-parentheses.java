class Solution {
    public String minRemoveToMakeValid(String s) {
      
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            
            char ch = s.charAt(i);
            if(!Character.isLowerCase(ch)) {
                
                if(stk.empty()){
                    stk.push(i);
                }
                else {
                    char top = s.charAt(stk.peek());
                    if(ch == ')' && top == '('){
                        stk.pop();
                    }
                    else {
                        stk.push(i);
                    }
                }
            }
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i=s.length()-1 ; i>=0; i--) {
            
            if(!stk.empty() && i == stk.peek()) {
               stk.pop(); 
            }
            else {
                str.append(s.charAt(i));
            }
        }
        return str.reverse().toString();
    }
}