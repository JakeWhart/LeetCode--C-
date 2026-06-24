class Solution {
    public int minimumCost(int[] cost) {
        int total = 0;
        Arrays.sort(cost);
        for(int i = cost.length-1;i>=0;i--){
            total+=cost[i];
        }
        for(int i = cost.length-3;i>=0;i-=3){
            total-=cost[i];
        }
        return total;
    }
}