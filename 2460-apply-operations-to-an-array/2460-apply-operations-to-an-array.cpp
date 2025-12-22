class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        for(int i = 1 ; i < nums.size();i++){
            if(nums[i]==nums[i - 1]){
                nums[i-1]*=2;
                nums[i] = 0;
            }
        }
        int countt = count(nums.begin(),nums.end(),0);
        for(int j = 0; j < countt;j++){
        for(int i  = 1 ; i < nums.size();i++){
            if(nums[i-1]==0){
                swap(nums[i-1],nums[i]);
            }
        }
            
        }
        return nums;
    }
};