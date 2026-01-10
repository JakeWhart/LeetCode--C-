class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        int size = nums.size();
        int even = 0; int odd = 1;
        while(even < size && odd < size){
            if(nums[even]%2==0){
                even+=2;
            }
           else  if(nums[odd]%2==1){
                odd+=2;
            }
            else swap(nums[odd],nums[even]);
        }

        return nums;}
};