class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int k = tokens.length-1;
        int i = 0;
        while(i<=k){
            if(power<tokens[i] && score>=1){
                power+=tokens[k];
                k--;
                score--;
            }
               if(power>=tokens[i]){
                power = power - tokens[i];
                score++;
                
               }
            i++;
            
        }
        
        return score;
}
}