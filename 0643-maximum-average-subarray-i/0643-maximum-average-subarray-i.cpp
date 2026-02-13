class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int ans = 0;
        int window = 0;
        for(int i = 0; i < k;i++){
            window+=nums[i];
        }
        ans = window;
        for(int i = k; i < nums.size();i++){
            window += nums[i] - nums[i - k];
            ans = max(ans,window);

        }
     return (double)ans/k;
     }
};