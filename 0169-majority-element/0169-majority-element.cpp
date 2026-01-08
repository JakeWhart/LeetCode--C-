class Solution {
public:
    int majorityElement(vector<int>& nums) {
       int num = 0;
       for(int i = 0; i < nums.size();i++){
        int countt = count(nums.begin(),nums.end(),nums[i]);
        if(countt>nums.size()/2) return nums[i];
       } 
   return 0; }
};