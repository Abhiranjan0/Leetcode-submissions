class Solution {
    public int mostWordsFound(String[] sentences) {
       int n = sentences.length;
       int max = 0;
       for(int i=0; i<n; i++) {
          String[] arr = sentences[i].split(" ");
          int length = arr.length;
           
          if(max < length) {
              max = length;
          } 
       }   
        return max;
    }
}