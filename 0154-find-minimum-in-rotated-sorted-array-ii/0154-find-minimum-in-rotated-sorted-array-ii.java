class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(start <= end && nums[start] == nums[end]){ //shrinking the array for removing duplicates which makes the algo confuse
            ans = Math.min(ans,nums[start]);             
            start++;                                    
            end--;
        }
        while(start <= end){    //left-part check
            int mid = start + (end - start) / 2;
            if(nums[start] <= nums[mid]){
                ans = Math.min(ans,nums[start]);
                start = mid + 1;
            }
            else{ //right-part check
                ans = Math.min(ans,nums[mid]);
                end = mid - 1;  
            }
        }
        return ans;
    }
}