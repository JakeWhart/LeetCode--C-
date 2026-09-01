class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[start] <= nums[mid]) { //Left part sorted check
                if (nums[start] <= target && target < nums[mid]) { //range check for the target
                    end = mid - 1; //if found - eliminate the right part
                } else {
                    start = mid + 1; //if not then eliminate the left part
                }
            }

            else { //if left part is not sorted then it means the right part is sorted
                if (nums[mid] < target && target <= nums[end]) { //range check
                    start = mid + 1; //if found eliminate left part
                } else {
                    end = mid - 1; //if not eliminate right part
                }
            }

        }
        return -1;
    }
}