class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        int k = 0;
       sort(nums.begin(),nums.end());
       for(int i = 1; i < nums.size();i++){
        if(nums[i]==nums[i-1]) k = nums[i];
  } return k;  }
};