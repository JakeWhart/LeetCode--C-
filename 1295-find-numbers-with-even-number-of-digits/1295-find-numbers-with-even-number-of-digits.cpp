class Solution {
public:
    int findNumbers(vector<int>& nums) {
         int count=0;
        for(int i = 0; i < nums.size();i++){
            while(nums[i]>=10){
                int digicount=0;
                int digit = 0;
                while(nums[i]>0){
                    digit = nums[i]%10;
                    nums[i]/=10;
                   digicount+=1;
                }
                if(digicount%2==0) count+=1;
            }
        }
   return count; }
};