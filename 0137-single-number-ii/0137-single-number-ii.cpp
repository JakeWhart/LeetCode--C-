class Solution {
public:
    int singleNumber(vector<int>& nums) {
        for(int i = 0; i < nums.size();i++){
            int count = 0;
            for(int j  = 1; j < nums.size();j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            }
            if(count<=1){
                return nums[i];
            }
        }
  return 0;  }
       
};