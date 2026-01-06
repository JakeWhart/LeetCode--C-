class Solution {
public:
    int subtractProductAndSum(int n) {
       int total = 0;
        while(n>=10){
             int sum = 0;
        int product = 1;
            while(n>0){
                sum+=n%10;
                product*=n%10;
                n/=10;
            }
            total = product - sum;
            return total;
        }
   return 0; }
};