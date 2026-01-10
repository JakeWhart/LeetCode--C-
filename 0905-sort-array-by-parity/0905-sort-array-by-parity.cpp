class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        if(nums.size()==1) return {nums};
        int pointer = 0;
        for(int i = 0; i < nums.size();i++){
            if(nums[i]%2==0){
                swap(nums[pointer],nums[i]);
                pointer++;
            }

        }
    return{nums};
    }
};