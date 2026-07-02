class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int idx = 0;
        for(int i = 0;i<m;i++){
            res[i] = nums1[i];
            idx++;
        }
        for(int i = 0; i < n;i++){
            res[idx] = nums2[i];
            idx++;
        }
        Arrays.sort(res);
        for(int i = 0; i < res.length;i++){
            nums1[i] = res[i];
        }
        
    }
}