class Solution {
public:
    bool isPerfectSquare(int num) {
       long long l = 1;
       long long r = num;
       while(l<=r){
        long long  mid = l + (r - l)/2;
        long long sq = mid * mid;
        if(num==sq) return true;
        else if(num>sq) l = mid + 1;
        else if(num<sq) r = mid - 1;
       }
      return false; }
};