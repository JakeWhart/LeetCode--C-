class Solution {
    public int maxProduct(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        res = (nums[nums.length-1] -1) * (nums[nums.length-2]-1);
        return res;
    }
}