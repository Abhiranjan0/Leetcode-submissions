// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
              for(int num: a) {
                  String number = String.valueOf(num);
                  int i=0;
                  int j = number.length()-1;
                  while(i<j) {
                      if(number.charAt(i) != number.charAt(j))
                           return 0;
                          i++; j--;
            
                  }
                  
              }
              
              return 1;
           }
}