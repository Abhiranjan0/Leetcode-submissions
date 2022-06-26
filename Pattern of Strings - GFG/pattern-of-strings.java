// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            ArrayList<String> result = ob.pattern(S);
            for(String value : result){
                System.out.println(value);
            }
            
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> pattern(String S) {
        
        ArrayList<String> str = new ArrayList<>();
          for(int i=S.length()-1;i>=0;i--){
            str.add(S.substring(0,i+1));
        }
        return str;
    }
};