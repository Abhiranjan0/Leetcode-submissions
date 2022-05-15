class Solution {
    public int findSpecialInteger(int[] arr) {
       int count = 1; 
       int comp = arr.length/4;
       
       for(int i=0; i<arr.length-1; i++) {
           if(arr[i] == arr[i+1]) 
               count ++ ;
           
           else 
               count = 1;
           
           if(count > comp) 
               return arr[i];
       } 
        return arr[arr.length-1];
    }
}