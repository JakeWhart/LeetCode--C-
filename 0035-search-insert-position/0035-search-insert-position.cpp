class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
       int l = 0;
       int r = nums.size()-1;
       int value = 0;
       while(l<=r){
        int middle = l + (r-l) / 2;
        if(target==nums[middle]) return middle;
        if(target > nums[middle]) l = middle+1;
        if(target < nums[middle]) r = middle-1;
    value = middle;
       } 
   return l; }
};