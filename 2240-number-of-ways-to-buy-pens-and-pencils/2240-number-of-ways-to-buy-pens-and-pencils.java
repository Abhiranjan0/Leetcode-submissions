class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
       long res = 0;
        
        res += (total/cost2 + 1);
        while(total > 0) {
            total -= cost1;
            
            if(total < 0)
                break;
            
            if(total == 0) {
               res += 1;
               break; 
            }
            res += total/cost2 + 1;
        }
        return res;
    }
}