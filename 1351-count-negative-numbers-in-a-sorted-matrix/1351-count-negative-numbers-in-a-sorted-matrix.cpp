class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        sort(grid.begin(),grid.end());
        int count = 0;
        for(int i = grid.size()-1; i > 0;i--){
            for(int j = grid.size()-1; j > 0;j--){
                if(grid[i][j] < 0 ){
                    count+=1;
                }
            }
        }
    return count;
    }
    
};