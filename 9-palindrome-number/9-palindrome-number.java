class Solution {
    public boolean isPalindrome(int x) {
    int r=0;       
    for(int i=x;i>0;i/=10)
    {
    r=r*10+(i%10);        
    }
    if(r==x)
    return(true);
        
    else
    return(false);
    }
}