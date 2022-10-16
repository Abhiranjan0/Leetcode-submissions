//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long maxi = Integer.MIN_VALUE;
        long temp = 1;
        long l = 1;
        for(int i=0; i<n; i++){
           temp *= arr[i];
           l *= arr[n-i-1];
           maxi = Math.max(maxi, Math.max(temp, l));
           if(temp == 0) temp=1;
           if(l == 0) l=1;
        }
        return maxi;
    }
}