class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] > arr[start+1]) return start;
        if(arr[end] > arr[end - 1]) return end;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int left = mid - 1;
            int right = mid + 1;
            if(arr[mid] > arr[left] && arr[mid] > arr[right]) return mid;
            else if(arr[mid] > arr[left]) start = mid + 1;
            else if(arr[mid] > arr[right]) end = mid ;
        }
        return -1;
    }
}