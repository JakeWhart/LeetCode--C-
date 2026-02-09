class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        int max_count = 0;
        int count = 0;
        for(int i = 0; i < arr.size();i++){
            if(arr[i]%2!=0){
                count++;
                max_count = max(max_count,count);
            }
            else {
                count = 0;
            }
        }
  return max_count>=3;  }
};