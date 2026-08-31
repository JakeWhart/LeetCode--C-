class Solution {
    public int minimumDeletions(int[] nums) {
        int min_val = Integer.MAX_VALUE, minPos = -1;
        int max_val = Integer.MIN_VALUE, maxPos = -1;
        int n = nums.length;
        for(int i = 0; i < nums.length;i++){
                if(nums[i]>max_val){
                    max_val = nums[i];
                    maxPos = i;
                }
                if(nums[i]<min_val){
                    min_val = nums[i];
                    minPos = i;
                }
        }
        int dels = 1;
         int front = Math.max(minPos, maxPos) + 1;
        int back = n - Math.min(minPos, maxPos);
        int both = Math.min(minPos, maxPos) + 1 + (n - Math.max(minPos, maxPos));

        return Math.min(front, Math.min(back, both));
    }
}