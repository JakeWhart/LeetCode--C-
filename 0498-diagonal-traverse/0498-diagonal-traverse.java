class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k <= (m*n-1)){
            res[k++] = mat[i][j];
            if((i+j)%2==0){
                 if(j==n-1) i+=1;
                 else if(i==0) j++;
                
                else{
                    i-=1;
                    j+=1;
                }
            }
            else{
             if(i==m-1) j+=1;
                else if(j==0) i+=1;
                else{
                    i+=1;
                    j-=1;
                }
            }
        }
        return res;
    }
}
