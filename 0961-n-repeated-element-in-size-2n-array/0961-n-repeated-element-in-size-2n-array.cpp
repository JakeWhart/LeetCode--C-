class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        int k = 0;
        for(int i = 0; i < nums.size();i++){
            int countt = count(nums.begin(),nums.end(),nums[i]);
            if(countt>1) k = nums[i];
        }
 return k;   }
};