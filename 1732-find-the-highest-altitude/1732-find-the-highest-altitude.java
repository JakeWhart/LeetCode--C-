class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length+1;
        int[] alt = new int[n];
        int sum = 0;
        for(int i = 0; i < gain.length;i++){
            sum+=gain[i];
            alt[i] = sum;
        }
        int high = -999999999;
        for(int i = 0; i < alt.length;i++){
            if(alt[i]>high) high = alt[i];
        }
        return high;
    }
}