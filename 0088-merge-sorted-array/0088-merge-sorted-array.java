class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int i = m - 1;
        int j = n - 1;
        int k = (m+n)-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                res[k] = nums1[i];
                k--;
                i--;
            } 
            else{
                res[k] = nums2[j];
                k--;
                j--;
            }
        }
        if(i==-1){
             while(j>=0){
                res[k] = nums2[j];
                k--;
                j--;
        }
        }
        else if(j==-1){
            while(i>=0){
                res[k] = nums1[i];
                i--;
                k--;
            }
        }
        for(int l = 0; l < res.length;l++){
            nums1[l] = res[l];
        }
        
        
    }
}