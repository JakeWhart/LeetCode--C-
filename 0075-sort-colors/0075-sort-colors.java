class Solution {
    public void sortColors(int[] nums) {
       int r = 0;
       int w = 0;
       int b = 0;
       for(int i = 0; i< nums.length;i++){
        if(nums[i]==0) r++;
        if(nums[i]==1) w++;
        if(nums[i]==2) b++;
       }
       int idx = 0;
       while(r>0){
        nums[idx] = 0;
        r--;
        idx++;
       }
       while(w>0){
        nums[idx] = 1;
        w--;
        idx++;
       }
       while(b>0){
        nums[idx] = 2;
        b--;
        idx++;
       }
    }
}