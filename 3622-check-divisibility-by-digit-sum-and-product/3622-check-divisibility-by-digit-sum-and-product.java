class Solution {
    public boolean checkDivisibility(int n) {
        long product = 1;
        long sum = 0;
        int tn = n;
        while(tn > 0){
            int temp = tn % 10;
            sum+= temp;
            product *= temp;
            tn /= 10;
        }
        long res = product + sum;
        if(n%res == 0) return true;
        else return false;
    }
    
}
