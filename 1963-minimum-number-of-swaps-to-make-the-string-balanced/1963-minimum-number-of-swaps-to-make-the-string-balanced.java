class Solution {
    public int minSwaps(String s) {
       Stack<Character> stk = new Stack<>();
       int mis = 0; 
       for(int i=0; i<s.length(); i++) {
           char ch = s.charAt(i);
           if(ch == '[') stk.push(ch);
           else if(!stk.isEmpty()) stk.pop();
           else mis++;
       }
        return (mis+1)/2;
    }
}