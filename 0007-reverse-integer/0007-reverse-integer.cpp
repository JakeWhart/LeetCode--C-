class Solution {
public:
    int reverse(int x) {
        long long rev = 0;
        long long p = x;
        if(x < 0)  p = -p;
        while(p>=0){
            int digit = p%10;
            rev = rev * 10 + digit;
            p/=10; 
        }
        if(x < 0) return 0-rev;
        if(rev > INT_MAX/10 || rev < INT_MIN/10) return 0;
     return int(rev);
     }
};