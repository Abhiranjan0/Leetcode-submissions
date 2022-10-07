class Solution {
    public int evalRPN(String[] tokens) {
       
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<tokens.length; i++){
            
            if(tokens[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b+a);
            }
            else if(tokens[i].equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            else if(tokens[i].equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(b*a);
            }
            else if(tokens[i].equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else{
               st.push(Integer.valueOf(tokens[i])); 
            }
        }
        
        return st.pop();
    }
}