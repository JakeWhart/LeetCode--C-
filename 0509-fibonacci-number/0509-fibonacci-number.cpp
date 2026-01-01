class Solution {
public:
    int fib(int n) {
        if(n==1) return 1;
        int fib = 0;
        int prev = 0;
        int prev2 = 1;
        for(int i = 0; i < n;i++){
            fib = prev+prev2;
            prev2 = prev;
            prev = fib;
        }
        return fib;
    }
};