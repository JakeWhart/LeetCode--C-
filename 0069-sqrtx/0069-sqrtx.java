class Solution {
    public boolean find(int x,int cur_sqrt){
        if(cur_sqrt  <= x / cur_sqrt) return true;
        else return false;
    }
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            boolean fl = find(x,mid);
            if(fl == true){
                ans = mid;
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }
}