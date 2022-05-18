class Solution {
    public double average(int[] salary) {
       int n = salary.length;
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       int sum = 0;
        
       for(int i=0; i<n; i++) {
           if(salary[i] > max)
               max = salary[i];
           
           if(salary[i] < min) {
               min = salary[i];
           }
           sum += salary[i];
           
       } 
       double finalSalary = sum - max - min;
       double avg = (finalSalary) / (n-2);
       return avg; 
        
    }
}