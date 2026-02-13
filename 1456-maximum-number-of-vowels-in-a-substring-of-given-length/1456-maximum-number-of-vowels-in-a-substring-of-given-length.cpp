class Solution {
public:
    int maxVowels(string s, int k) {
        int res = 0; 
        int window = 0;
        for(int i = 0; i < k; i++){
            if(vowel(s[i])){
                window++;
            }
        }
        res = window;
        for(int i = k;i < s.length();i++){
            if(vowel(s[i])){
                window++;
            }
            if(vowel(s[i-k])){
                window--;
            }
            res = max(res,window);
        }
    return res;
    }
    bool vowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c=='u'){
            return true;
        }
    return false;}
};