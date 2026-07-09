class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int i = 0;
        int j = 0;
        int fl = 0;
        while(i<word1.length() && j < word2.length()){
            char ic = word1.charAt(i);
            char jc = word2.charAt(j);
           s+=ic;
           s+=jc;
           i++;
           j++;

    }
    if(j<=word2.length()-1){
        while(j<word2.length()){
            char jc = word2.charAt(j);
            s+=jc;
            j++;
        }
    }
    if(i<=word1.length()-1){
        while(i<word1.length()){
            char ic = word1.charAt(i);
            s+=ic;
            i++;
        }
    }


     return s;
}
}