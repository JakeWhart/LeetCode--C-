class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[5];

        for(int i = 0;i < text.length();i++){
            char ch = text.charAt(i);
            if(ch=='b'){
                count[0]+=1;
            }
            if(ch=='a'){
                count[1]+=1;
            }
            if(ch=='l'){
                count[2]+=1;
            }
            if(ch=='o'){
                count[3]+=1;
            }
            if(ch=='n'){
                count[4]+=1;
            }
        }
       int min = count[0];
        count[2]/=2;
        count[3]/=2;
       for(int i = 0;i < count.length;i++){
        if(count[i]<min){
            min = count[i];
        }
       }
       return min;
    }
}