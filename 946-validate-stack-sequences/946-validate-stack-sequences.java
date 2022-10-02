class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       
        Stack<Integer> stk = new Stack<>();
        int k = 0;
        
        for(int val : pushed){
            stk.push(val);
            
            while(!stk.isEmpty() && stk.peek()==popped[k]){
                stk.pop();
                k++;
            }
        }
        return stk.isEmpty();
    }
}