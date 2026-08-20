class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int i = 0; i < nums.length;i++){
            max = Math.max(nums[i],max);
        }
        int low = 1;
        int end = max;
        int ans = 0;
        while(low <= end){
            int mid = low + (end - low) / 2;
            int t = div(nums,mid);
            if(t <= threshold){
                ans = mid;
                end = mid - 1;
            }
            else{
                
                low = mid + 1;
            }
        }
        return ans;
    }
    private int div(int[] nums, int mid){
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum += (nums[i] + mid - 1) / mid;
        }
        return sum;
    }
}