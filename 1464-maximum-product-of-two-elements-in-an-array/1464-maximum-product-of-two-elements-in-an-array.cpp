class Solution {
public:
    int maxProduct(vector<int>& nums) {
        sort(nums.begin(),nums.end(),greater<int>());
        int first = 0;
        int last = 1;
        int result = (nums[first]-1)*(nums[last]-1);
        return result;
    }
};