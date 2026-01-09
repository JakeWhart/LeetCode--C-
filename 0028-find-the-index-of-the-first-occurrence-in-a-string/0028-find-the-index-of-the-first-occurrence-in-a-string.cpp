class Solution {
public:
    int strStr(string haystack, string needle) {
     int j = 0;
        int pos = -1;
        for(int i = 0; i < haystack.size();i++){
            if(haystack[i]!=needle[j]){
                continue;
            }
            pos++;
        }
   return pos-1; }
};