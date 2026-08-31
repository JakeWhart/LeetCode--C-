class Solution {
    public int missingMultiple(int[] nums, int k) {
        int temp = 2;
        int tb = k;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length ;i++){
            if(nums[i] == tb){
                tb = k * temp;
                temp++;
            }
        }
        return tb;
    }
}