class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {      
        int n = nums.size();
        vector<int> index(n);
        
        for(int i = 0; i < n; i++) {
            index[i] = i;
        }
        
        sort(index.begin(), index.end(), [&](int a, int b){
            return nums[a] < nums[b];
        });
        
        int left = 0;
        int right = n - 1;
        
        while(left < right) {
            int sum = nums[index[left]] + nums[index[right]];
            
            if(sum == target) {
                return {index[left], index[right]};
            }
            else if(sum > target) {
                right--;
            }
            else {
                left++;
            }
        }
        
        return {};
    }
};