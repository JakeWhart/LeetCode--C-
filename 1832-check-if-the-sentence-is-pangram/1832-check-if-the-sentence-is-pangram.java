class Solution {
    public boolean checkIfPangram(String sentence) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int[] arr = new int[26];
        for(int i = 0; i < a.length();i++){
            char c = a.charAt(i);
            for(int j = 0; j < sentence.length();j++){
                char temp = sentence.charAt(j);
                if(c==temp){
                    arr[i] = 1;
                }
            }
        }
        for(int x:arr){
            if(x==0){
                return false;
            }
        }
        return true;
    }
}