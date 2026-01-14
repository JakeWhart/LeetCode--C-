class Solution {
public:
    bool isAnagram(string s, string t) {
        sort(s.begin(),s.end());
        sort(t.begin(),t.end());
        bool result = true;
         if(s.length()!=t.length()) result = false;
        for(int i = 0; i < s.length();i++){
            if(s[i]!=t[i]) result = false;
        }
   return result; }
};