class Solution {
public:
    bool isPalindrome(int x) {
        int org = x;
        int ans = 0;
        int rev = 0;
        while(x>0){
            int digit = x%10;
            rev = rev * 10 + digit;
            x/=10;
        }
        return rev == org;
    }
};