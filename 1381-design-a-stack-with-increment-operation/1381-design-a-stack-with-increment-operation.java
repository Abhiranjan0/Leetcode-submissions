class CustomStack {

    int max;
    int end;
    int[] res;
    
    public CustomStack(int maxSize) {
        end = 0;
        max = maxSize;
        res = new int[maxSize];
    }
    
    public void push(int x) {
        if(end < max){
            res[end] = x;
            end++;
        }
    }
    
    public int pop() {
        if(end!=0) {
          int x = res[end-1];
          end--;  
          return x;  
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<k && i<end; i++){
            res[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */