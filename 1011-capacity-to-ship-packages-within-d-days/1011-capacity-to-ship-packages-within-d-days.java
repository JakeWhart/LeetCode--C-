class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int total = 0;
        int max = 0;
        for(int i = 0; i < weights.length;i++){
            total+=weights[i];
            max = Math.max(max,weights[i]);
        }
        int low = max;
        int end = total;
        int ans = 0;
        while(low <= end){
            int middle = low + (end - low) / 2;
            int day = req(weights,middle);
            if(day <= days){
                ans = middle;
                end = middle - 1;
            }
            else{
                low = middle + 1;
            }
        }
            return ans;
    }
    private int req(int[] weights, int middle){
        int day = 1;
        int sum = 0;
        for(int i = 0; i < weights.length;i++){
             
            if(sum+weights[i] > middle){
                day++;
                sum = 0;
            }
             sum+=weights[i];
        }
        return day;
    }
}