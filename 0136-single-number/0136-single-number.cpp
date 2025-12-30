class Solution {
public:
    int singleNumber(vector<int>& nums) {
      int k = 0;
      for(int x : nums){
        k^=x;
      }
      return k;
    }
};