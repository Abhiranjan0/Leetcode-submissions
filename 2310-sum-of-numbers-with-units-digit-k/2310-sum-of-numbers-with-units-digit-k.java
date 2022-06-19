class Solution {
    public int minimumNumbers(int num, int k) {
        if(num == 0) return 0;

        int sum = k, size = 1, temp = num % 10;

        while(size <= 10) {
            if(sum % 10 == temp) return size;
            if(sum > num) return -1;
            
            sum += k;
            size++;
        }

        return -1;
    }
}