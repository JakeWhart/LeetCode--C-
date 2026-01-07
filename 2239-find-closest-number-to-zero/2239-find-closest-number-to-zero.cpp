class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
        int distance = nums[0];
        for(int i = 0; i < nums.size();i++){
             if (abs(nums[i]) < abs(distance) ||
               (abs(nums[i]) == abs(distance) && nums[i] > distance)) {
                distance = nums[i];}
        }
   return distance; }
};