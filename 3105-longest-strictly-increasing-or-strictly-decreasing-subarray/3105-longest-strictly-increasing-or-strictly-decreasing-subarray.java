class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dcr = 1;
        int maxL = 1;
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i] < nums[i+1]){
                inc++;
                dcr = 1;
            }
            else if(nums[i] > nums[i + 1]){
                dcr++;
                inc = 1;
            }
            else{
                inc = 1;
                dcr = 1;
            }
            maxL = Math.max(maxL,Math.max(inc,dcr));
        }
        return maxL;
    }
   
}