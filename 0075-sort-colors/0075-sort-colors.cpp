class Solution {
public:
    void sortColors(vector<int>& nums) {
        int r = 0;
        int w = 0;
        int b = 0;
        for(int i = 0; i < nums.size();i++){
           if(nums[i]==0) r++;
           if(nums[i]==1) w++;
           if(nums[i]==2) b++;
        }
        int index = 0;
        while(r>0){
            nums[index++] = 0;
            r--;
        }
        while(w > 0){
            nums[index++] = 1;
            w--;
        }
        while(b > 0){
            nums[index++] = 2;
            b--;
        }
        
    }
};