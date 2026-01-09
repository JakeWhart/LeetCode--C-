class Solution {
public:
    int maxArea(vector<int>& height) {
     int left = 0;
     int right = height.size()-1;
     int max_area = 0;
     while(left<=right){
        int width = right - left;
        int length = min(height[left],height[right]);
        int area = width*length;
        max_area = max(area,max_area);

        if(height[left]>height[right]){
            right--;
        }
        else{
            left++;
        }
     }   
  return max_area;  }
};