class Solution {
    public int maxProduct(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i = nums.length-1;i>0;i--){
            int j = i - 1;
            int temp = (nums[i]-1) * (nums[j]-1);
            res = Math.max(res,temp);
        }
        return res;
    }
}