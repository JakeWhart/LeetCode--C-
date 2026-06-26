class Solution {
    public void setZeroes(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
       int[][] res = new int[n][m];
       for(int i = 0;i < n;i++){
        for(int j = 0; j < m;j++){
            if(matrix[i][j]==0){
                int k = i;
                int l = j;
                for(int p = 0;p < m;p++){
                    res[k][p] = 1;
                }
                for(int p = 0; p < n;p++){
                    res[p][l] = 1;
                }
            }
        }
       }
       for(int i = 0; i < n;i++){
        for(int j = 0; j < m;j++){
            if(res[i][j]==1) res[i][j] = 0;
            else{
                res[i][j] = matrix[i][j];
            }
        }
       }
       for(int i = 0; i < n;i++){
        for(int j = 0; j < m;j++){
            matrix[i][j] = res[i][j];
        }
       }
    }
}