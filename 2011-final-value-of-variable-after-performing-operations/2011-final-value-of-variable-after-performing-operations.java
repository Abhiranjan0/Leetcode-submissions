class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int sum = 0;
       for(String str : operations) {
           if("--X".equals(str) || "X--".equals(str)) {
               sum --;
           }
           else {
               sum ++;
           }
       } 
        return sum;
    }
}