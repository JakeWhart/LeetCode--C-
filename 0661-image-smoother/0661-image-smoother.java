class Solution {
    public int[][] imageSmoother(int[][] img) {
       int m = img.length;
       int n = img[0].length;
        int[] ai = {0,1,1,-1,-1,0,1,-1};
        int[] aj = {1,0,1,0,-1,-1,-1,1};
        int[][] res = new int[m][n];
       for(int i = 0; i < m;i++){
        for(int j = 0;j < n;j++){
            int sum = 0;
            int count = 1;
             sum += img[i][j];
            for(int k = 0;k < 8;k++){
                int ni = i + ai[k];
                int nj = j + aj[k];
                if(ni<m && ni>=0 && nj<n && nj>=0){
                sum+=img[ni][nj];
                count+=1;
            }
             }  
            res[i][j] = sum/count;   
        }
       }
       return res;
    }
}