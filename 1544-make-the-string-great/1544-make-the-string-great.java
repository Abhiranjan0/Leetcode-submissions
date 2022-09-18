class Solution {
    public String makeGood(String s) {
        Stack<Character> stk  = new Stack<>();
        stk.push(s.charAt(0));
        
        for(int i=1; i<s.length(); i++) {
          if(!stk.isEmpty() && Math.abs(s.charAt(i) - stk.peek()) == 32) stk.pop();
            else
                stk.push(s.charAt(i));
        }
        
        char[] ch = new char[stk.size()];
        for(int i = ch.length-1; i>=0; i--) {
            ch[i] = stk.pop();
        }
        return new String(ch);
    }
}