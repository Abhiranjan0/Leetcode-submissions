class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        ArrayList<String> res = new ArrayList<>();
        int[] arr = new int[target.length];
        
        for(int i=0, j=1; i<n; i++,j++) {
            
            
            if(arr[i] == 0) {
                arr[i] = j;
                res.add("Push");
            }
            
            
            if(arr[i] != target[i]) {
                arr[i] = 0;
                res.add("Pop");
                i--;
            }
            
            
            if(Arrays.equals(arr, target)) {
                break;
            }
        }
        
        return res;
    }
}